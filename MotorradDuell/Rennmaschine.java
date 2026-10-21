package Java_Mini_Projects.MotorradDuell;

public class Rennmaschine extends Motorrad {

    public Rennmaschine(String name, int strecke) {super (name, strecke);};

    @Override
    public void fahreRunde() {
        int random = (int) (Math.random() * 31) + 30;

        addiereStrecke(random);
    }

}
