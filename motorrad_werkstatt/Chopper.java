package Java_Mini_Projects.motorrad_werkstatt;

public class Chopper extends Motorrad {
    // Konstruktor
    public Chopper(String marke, String modell) {
        super(marke, modell);
    }

    @Override
    public void beschleunigen() {
        int speed = (int) (Math.random()*6) + 35;

        int neuGeschwindigkeit = this.geschwindigkeit() + speed;

        if (neuGeschwindigkeit > 115) {
            this.setGeschwindigkeit(115);
            System.out.println("limit erreicht 115 km/h");
        } else {
            this.setGeschwindigkeit(neuGeschwindigkeit);
        }
    }
}
