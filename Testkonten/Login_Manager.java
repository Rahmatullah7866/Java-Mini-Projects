package Java_Mini_Projects.Testkonten;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Login_Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Farben für die Konsole
        String rot = "\u001B[31m";
        String gelb = "\u001B[33m";
        String gruen = "\u001B[32m";
        String reset =  "\u001B[0m";

        Path p = Path.of("src", "Java_Mini_Projects", "Testkonten","users.txt");
        if (Files.notExists(p)) {
            System.out.println(rot + "datei existiert nicht" + reset);
        } else {
            System.out.println(gruen + "datei existiert bereits" + reset);
        }
        System.out.println();

        // Menu
        System.out.println("=== LOGIN MANAGER ===\n");
        System.out.println("1. Anmelden\n");
        System.out.println("2. Benutzerliste anzeigen\n");
        System.out.println("3. Beenden");

        System.out.println("\nWaehlen Sie ein Option: ");

        int auswahl = sc.nextInt();

        String name = "unbekannt";
        boolean loginErfolgreich = false;

        switch (auswahl) {
            case 1:
                System.out.println("Benutzername: ");
                name = sc.next();

                System.out.println("Passwort: ");
                String passwort = sc.next();

                try {
                    List<String> zeilen = Files.readAllLines(p);

                    for (String zeile : zeilen) {
                        String[] teile = zeile.split(";");

                        if (teile.length == 2) {
                            String gespeicherterUser = teile[0].trim();
                            String gespeicherterPasswort = teile[1].trim();

                            if (gespeicherterUser.equals(name) && gespeicherterPasswort.equals(passwort)) {
                                loginErfolgreich = true;
                                break;
                            }
                        }
                    }
                }catch (IOException e) {
                    System.out.println(rot + "Fehler beim Lesen der Datei" + reset);
                }

                // rückmeldung ausgeben
                if (loginErfolgreich) {
                    System.out.println(gruen + "Anmedlung erfolgreich" + reset);
                } else {
                    System.out.println(rot + "Ungültiger Benutzername oder Passwort" + reset);
                }
                break;

            case 2:
                System.out.println("1. admin");
                System.out.println("2. max");
                System.out.println("3. lisa");
                System.out.println("4. omar");
                System.out.println("5. sophie");
                break;

            case 3:
                System.out.println("Programm beendet Vielen Dank.");
                break;

            default:
                System.out.println(gelb + "Ungueltige Auswahl" + reset);
        }

        // Protokollierung
        String status = loginErfolgreich ? "Erfolg" : "Fehler";

        String logEintrag = name + ";" + status + System.lineSeparator();
        Path logPath = Path.of("src", "Java_Mini_Projects", "Testkonten","login_log.txt");

        try {
            Files.writeString(
                    logPath,
                    logEintrag,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println(rot + "Fehler bim Schreiben des Logs" + reset);
        }

        sc.close();
    }
}
