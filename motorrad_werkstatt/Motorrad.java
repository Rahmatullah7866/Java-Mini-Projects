package Java_Mini_Projects.motorrad_werkstatt;

public abstract class Motorrad {

    // attribute
    private String marke;
    private String modell;
    private int geschwindigkeit = 0;

    // Konstruktor
    public Motorrad(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
    }

    // gitter marke
    public String getMarke() {
        return marke;
    }

    // gitter modell
    public String getModell() {
        return modell;
    }

    // gitter geschwindigkeit
    public int geschwindigkeit() {
        return this.geschwindigkeit;
    }

    // setter geschwindigkeit
    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    // abstrakt methode
    public abstract void beschleunigen();

    public void infoAnzeigen() {
        System.out.println("Marke: " + marke + " Modell: " + modell);
        System.out.println("Startgeschwindigkeit: " + geschwindigkeit);
    }

}
