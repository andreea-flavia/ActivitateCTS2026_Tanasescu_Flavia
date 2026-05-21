package ro.ase.cts.F7_Decorator;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet(5, 1);
        bilet.printeaza();
        Decorator deco = new DecoratorLMA(bilet);
        deco.printeazaMesaj();
    }
}
