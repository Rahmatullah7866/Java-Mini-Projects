package Java_Mini_Projects.randomnumber;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        int geheimzahl = (int) (Math.random()*100) + 1;
        int versuch = 0;
        int anzahl = 0;

        System.out.println("----ZahlRaten----");
        System.out.println("Bitte geben Sie einen Zahl ein:");

        while (versuch != geheimzahl) {
            System.out.println("Deine Zahl:");
            versuch = scanner.nextInt();
            anzahl++;

            if (versuch < geheimzahl) {
                System.out.println("Zu klein");
            } else if (versuch > geheimzahl) {
                System.out.println("Zu groß");
            } else {
                System.out.println("Richtig geraten");
                System.out.println("Versuche: " + anzahl);
            }
        }

        scanner.close();
    }

}
