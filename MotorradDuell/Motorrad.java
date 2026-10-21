package Java_Mini_Projects.MotorradDuell;

public abstract class Motorrad {
    private String name;
    private int strecke = 0;

    // Konstruktor
    public Motorrad(String name, int strecke) {
        this.name = name;
        this.strecke = strecke;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getStrecke() {
        return strecke;
    }

    protected void addiereStrecke(int meter) {
        strecke += meter;
    }

    public abstract void fahreRunde();
}
