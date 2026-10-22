package Java_Mini_Projects.Monster_Arena;

public class Drache extends Monster {
    public Drache(String name, int lebenspunkte) {
        super(name, lebenspunkte);
    }

    @Override
    public void angreifen() {
        System.out.println("Drache spuck einen riesigen Feuerball!");
    }
}