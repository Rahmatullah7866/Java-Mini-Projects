package Java_Mini_Projects.motorrad_werkstatt;

public class Main {
    public static void main(String[] args) {
        Motorrad sport1 = new SportMotorrad("Yamaha", "R1");
        Motorrad sport2 = new SportMotorrad("Kawasaki", "Ninja");
        Motorrad chopper = new Chopper("Harley-Davidson", "Iron 883");

        Motorrad[] motoraeder = {sport1, sport2, chopper};
        System.out.println("=== MOTORRad-WERKSTATT ===");

        for (Motorrad motor : motoraeder) {
            motor.infoAnzeigen();

            motor.beschleunigen();
            System.out.println("Testfahrt 1: " + motor.geschwindigkeit() + " km/h");

            motor.beschleunigen();
            System.out.println("Testfahrt 2: " + motor.geschwindigkeit() + " km/h");

            motor.beschleunigen();
            System.out.println("Testfahrt 3: " + motor.geschwindigkeit() + " km/h");

            System.out.println("---------------------------------");

        }
    }
}
