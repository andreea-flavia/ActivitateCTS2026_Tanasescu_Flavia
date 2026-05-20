package ro.ase.cts.A11strategy;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Flavi", 21);
        p1.plateste();
        p1.setModPlata(new PlataCash());
        p1.plateste();
    }
}
