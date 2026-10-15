package Java_Mini_Projects.Bankkonto;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kontostand = 100;
        int auswahl = 0;

        while (auswahl != 4) {
            System.out.println("\n=== BankAutomat===");
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Geld einzahlen");
            System.out.println("3. Geld abheben");
            System.out.println("4 Beenden");

            System.out.println("Deine Auswahl: ");
            auswahl = sc.nextInt();

            //switch mit break

            switch (auswahl) {
                case 1:
                    System.out.println("Kontostand: " + kontostand + " Euro");
                    break;
                case 2:
                    System.out.println("Einzahlung: ");
                    int einzahlung = sc.nextInt();
                    if (einzahlung > 0) {
                        kontostand += einzahlung;
                        System.out.println("Einzahlung erfolgreich");
                    } else {
                        System.out.println("Ungültiger Betrag");
                    }
                    break;
                case 3:
                    System.out.println("Auszahlung (Nur 10 20 oder 50 Euro Scheine verfügbar");
                    int betrag = sc.nextInt();

                    // moderne switch expression mit yield
                    String ergebnis = switch (betrag) {
                        case 10, 20, 30 -> {
                            if (betrag <= kontostand) {
                                kontostand -= betrag;
                                yield "Auszahlung erfolgreich";

                            } else {
                                yield "Nicht genügend Guthaben";
                            }
                        }
                        default -> {
                                yield "Nur 10,20 oder 50 Euro erlaubt";
                            }
                        };
                    System.out.println(ergebnis);
                    break;

                case 4:
                    System.out.println("Auf Wiedersehen");
                    break;

                default:
                    System.out.println("Ungültige Auswahl");

            }
        }
        sc.close();
    }
}
