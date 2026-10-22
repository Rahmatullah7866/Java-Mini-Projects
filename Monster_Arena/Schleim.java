package Java_Mini_Projects.Monster_Arena;

public class Schleim extends Monster {
    public Schleim(String name, int lebenspunkte) {
        super(name, lebenspunkte);
    }

    @Override
    public void angreifen() {
        System.out.println("Schleim spring auf den Gegner!");
    }
}
