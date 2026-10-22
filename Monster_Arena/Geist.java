package Java_Mini_Projects.Monster_Arena;

public class Geist extends Monster {
    public Geist(String name, int lebenspunkte) {
        super(name, lebenspunkte);
    }

    @Override
    public void angreifen() {
        int random = (int) (Math.random() * 3) +1;
        if (random == 1) {
            System.out.println("Buh! Der Gegner erschrickt");
        } else if (random == 2) {
            System.out.println("Der Geist wird unsichtbar");
        } else {
            System.out.println("Der Geist wirft einen verfluchten Kürbis!");
        }
    }

    @Override
    public void schadenNehmen(int schaden) {
        if (Math.random() < 0.25) {
            System.out.println(getName() + " ist Unschlagbar und weicht dem Schaden komplett aus!");
        } else {
            super.schadenNehmen(schaden);
        }
    }
}
