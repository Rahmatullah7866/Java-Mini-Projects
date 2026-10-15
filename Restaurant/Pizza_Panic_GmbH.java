package Java_Mini_Projects.Restaurant;

import java.util.Scanner;

public class Pizza_Panic_GmbH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int auswahl_pizza = 0;
        int auswahl_getraenk = 0;
        double gesamt_preis = 0;
        int bestellen = 0;

        while (menu != 5) {
            System.out.println("========================================");
            System.out.println("\n");
            System.out.println("         PIZZA PANIC GmbH        ");
            System.out.println("\n");
            System.out.println("========================================");
            System.out.println("\n");
            System.out.println("1. Pizza bestellen");
            System.out.println("2. Getränke bestellen");
            System.out.println("3. Warenkorb anzeigen");
            System.out.println("4. Bestellung abschließen");
            System.out.println("5. Programm beenden");
            System.out.println("\n");
            System.out.println("=======================================");
            System.out.println("\n");

            System.out.println("Bitte wähle eine Option: ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Welche Pizza möchtest du?");
                    System.out.println("1. Margherita | Preis: 8 Euro");
                    System.out.println("2. Salami | Preis: 10 Euro");
                    System.out.println("3. Hawaii | Preis: 11 Euro");

                    auswahl_pizza = sc.nextInt();

                    if (auswahl_pizza == 1) {
                        System.out.println("Eine Pizaa Margherita wurde hinzugefügt!");
                        gesamt_preis += 8;
                    } else if (auswahl_pizza == 2) {
                        System.out.println("Eine Pizza Salami wurde hinzugefügt!");
                        gesamt_preis += 10;
                    } else if (auswahl_pizza == 3) {
                        System.out.println("Eine Pizza Hawaii wurde hinzugefügt!");
                        gesamt_preis += 11;
                    } else {
                        System.out.println("Ungültige Auswahl");
                    }
                    System.out.println("Neuer Warenkorbwert: " + gesamt_preis + " Euro");
                    break;

                case 2:
                    System.out.println("Welche Getränk möchtest du?");
                    System.out.println("1. Wasser | Preis: 2 Euro");
                    System.out.println("2. Cola | Preis: 3 Euro");
                    System.out.println("3. Kaffee | Preis: 4 Euro");

                    auswahl_getraenk = sc.nextInt();

                    if(auswahl_getraenk == 1) {
                        System.out.println("Ein Flasche Wasser wurde hinzugefügt!");
                        gesamt_preis += 2;
                    } else if (auswahl_getraenk == 2) {
                        System.out.println("Ein Flasche Cola wurde hinzugefügt!");
                        gesamt_preis += 3;
                    } else if (auswahl_getraenk == 3) {
                        System.out.println("Eine Kaffee wurde hinzugefügt!");
                        gesamt_preis += 4;
                    } else {
                        System.out.println("Ungültige Auswahl");
                    }
                    System.out.println("Neuer Warenkorbwert: " + gesamt_preis + " Euro");
                    break;

                case 3:
                    System.out.println("=========Warenkorb=========");
                    System.out.println("Warenkorbwert               |       Rabatt  ");
                    System.out.println("Unter 20 Euro               |       0 %");
                    System.out.println("Ab 20 €, aber unter 40 €    |       10%");
                    System.out.println("Ab 40 €                     |       20%");

                    System.out.println("====== BESTELLUNG======");
                    System.out.println("Warenkorb: " + gesamt_preis + " Euro");

                    if (gesamt_preis < 20 ) {
                        System.out.println("Rabatt 0 %");
                        System.out.println("Endpreis: " +  gesamt_preis + " Euro");
                    } else if (gesamt_preis >= 20 && gesamt_preis < 40 ) {
                        System.out.println("Rabatt 10 %");
                        System.out.println("Endpreis: " + gesamt_preis * 0.90 + " Euro");
                    } else if (gesamt_preis >= 40) {
                        System.out.println("Rabatt 20 %");
                        System.out.println("Endpreis: " + gesamt_preis * 0.80 + " Euro");
                    } else {
                        System.out.println("System Fehler");
                    }
                    break;

                case 4:
                    System.out.println("Bestellung Abschließen");
                    System.out.println("1. JA");
                    System.out.println("2. Abbrechen");

                    bestellen = sc.nextInt();
                    if (bestellen == 1) {
                        if (gesamt_preis == 0) {
                            System.out.println("Warenkorb ist leer!");
                        } else {
                            int Lieferzeit = (int) (Math.random()*51) + 10;

                            System.out.println("Vielen Dank für Ihre Bestellung!");
                            System.out.println("Geschätzte Lieferzeit: " + Lieferzeit + " Minuten");

                            if (Lieferzeit <= 20) {
                                System.out.println("Kevin ist heute verdächtig schnell!.");
                            } else if (Lieferzeit <= 40) {
                                System.out.println("Kevin ist unterwegs. Wahrscheinlich.");
                            } else {
                                System.out.println("Kevin hat sich vermutlich wieder verfahren.");
                            }
                        }
                    } else if (bestellen == 2) {
                        System.out.println("Auf Wiedersehen");
                    } else {
                        System.out.println("Ungültiges Auswahl");
                    }
                    System.out.println("gesamt_preis: " + gesamt_preis + " Euro");
                    gesamt_preis = 0;
                    break;

                case 5:
                    System.out.println("Programm beendet");
                    gesamt_preis = 0;
                    System.out.println("Vielen Dank für den Besuch");
                    break;

                default:
                    System.out.println("Ungültige Auswahl");

            }
        }
    }
}
