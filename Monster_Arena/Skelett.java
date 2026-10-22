package Java_Mini_Projects.Monster_Arena;

public class Skelett extends Monster{
    public Skelett(String name, int lebenspunkte) {
        super(name, lebenspunkte);
    }

    @Override
    public void angreifen() {
        System.out.println("Skelett schwingt sein rostiges Schwert!");
    }
}
