package Java_Mini_Projects.motorrad_werkstatt;

public class SportMotorrad extends Motorrad {
    // Konstruktor
    public SportMotorrad(String marke, String modell) {
        super(marke, modell);
    }

    @Override
    public void beschleunigen() {
        int speed = (int) (Math.random()*21) + 50;
        int neuGeschwindigkeit = this.geschwindigkeit() + speed;

        if (neuGeschwindigkeit > 200) {
            this.setGeschwindigkeit(200);
            System.out.println("limit erreicht 200 km/h");
        } else {
            this.setGeschwindigkeit(neuGeschwindigkeit);
        }

    }
}