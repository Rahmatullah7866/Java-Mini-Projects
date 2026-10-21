package Java_Mini_Projects.MotorradDuell;

public class Main {
    public static void main(String[] args) {
        Motorrad typ1 = new Rennmaschine("Blitz", 0);
        Motorrad typ2 = new Tourer("Donner", 0);

        Motorrad[] arr = {typ1, typ2};

        System.out.println("=== MOTORRAD-DUELL ===");
        for (int runde = 1; runde <= 5; runde++) {
            arr[0].fahreRunde();
            arr[1].fahreRunde();
            System.out.println("Runde: " + runde + " " + arr[0].getName() + " " + arr[0].getStrecke() + " m | " + arr[1].getName() + " " + arr[1].getStrecke() + " m");

            if (arr[0].getStrecke() > arr[1].getStrecke()) {
                System.out.println(arr[0].getName() + " führt gerade");
            } else if (arr[0].getStrecke() < arr[1].getStrecke()) {
                System.out.println(arr[1].getName() + " führt gerade");
            } else {
                System.out.println("Gleichstand!");
            }
        }
        if (arr[0].getStrecke() > arr[1].getStrecke()) {
            System.out.println("Gewinner: " + arr[0].getName());
        } else if  (arr[0].getStrecke() < arr[1].getStrecke()) {
            System.out.println("Gewinner: " + arr[1].getName());
        }  else {
            System.out.println("Gewinner: Gleichstand!");
        }
    }
}
