package Java_Mini_Projects.MotorradDuell;

public class Tourer extends Motorrad {
    public Tourer (String name, int strecke) {super(name, strecke);}

    @Override
    public void fahreRunde() {
        int random = (int) (Math.random() * 21) + 30;

        addiereStrecke(random);
    }
}