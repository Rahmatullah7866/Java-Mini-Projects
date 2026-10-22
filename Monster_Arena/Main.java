package Java_Mini_Projects.Monster_Arena;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Monster drache = new Drache("Flammenfurz", 100);
        Monster Schleim = new Schleim("Glibber", 60);
        Monster Skelett = new Skelett("Knochen-Klaus", 80);
        Monster Drache = new Drache("Toastinator",75);
        Monster Geist = new Geist("Geist",50);

        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(drache);
        monsters.add(Schleim);
        monsters.add(Skelett);
        monsters.add(Drache);
        monsters.add(Geist);

        System.out.println("=== MONSTER-CHAOS ===");

        for ( int runde = 1; runde <= 3; runde ++ ) {
            System.out.println("\n--- Runde: " + runde + " ---" );
            for (Monster monster : monsters) {
                int min = 10;
                int max = 40;
                int random = (int) (Math.random() * (max - min + 1)) + min;

                if(!monster.istLebendig()) {
                    System.out.println(monster.getName() + ": " + " ist besiegt \n");
                    continue;
                }

                System.out.println("\n" + monster + ": " + monster.getLebenspunkte() + " HP");
                monster.schadenNehmen(random);

                if (monster.istLebendig()) {
                    monster.heilen(10);
                    monster.angreifen();
                } else {
                    System.out.println(monster.getName() + " ist besiegt \n");
                }
            }
        }
    }
}
