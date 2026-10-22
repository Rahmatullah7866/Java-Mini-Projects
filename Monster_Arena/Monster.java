package Java_Mini_Projects.Monster_Arena;

public abstract class Monster {
    private String name;
    private int lebenspunkte;
    private int maxLebenspunkte = 100;

    // Konstruktor
    public Monster(String name, int lebenspunkte) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void schadenNehmen(int schaden) {
        if (schaden > 0) {
            this.lebenspunkte -= schaden;
            if (this.lebenspunkte < 0) {
                this.lebenspunkte = 0;
            }
        }
        System.out.println("Schaden: " + schaden + " -> " + this.lebenspunkte + " HP");
    }

    public boolean istLebendig() {
        return this.lebenspunkte > 0;
    }

    public void heilen(int punkte) {
        if (!istLebendig()) {
            return;
        }

        this.lebenspunkte += punkte;
        if(this.lebenspunkte > this.maxLebenspunkte) {
            this.lebenspunkte = this.maxLebenspunkte;
        }
        System.out.println("Heilung: +" + punkte + " -> " + this.lebenspunkte + " HP");
    }

    @Override
    public String toString() {
        return this.name;
    }

    public abstract void angreifen();


}