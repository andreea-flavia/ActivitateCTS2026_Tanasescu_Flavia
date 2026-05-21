package ro.ase.cts.F7_Decorator;

public class Bilet implements IBilet{
    private int pretBilet;
    private int linie;

    public Bilet(int pretBilet, int linie) {
        this.pretBilet = pretBilet;
        this.linie = linie;
    }

    @Override
    public void printeaza() {
        System.out.println("Bilet "+this.linie+" in valoare de "+this.pretBilet+" lei - GENERAT");
    }
}
