package ro.ase.cts.F10_Strategy;

import ro.ase.cts.F10_Strategy.clase.Bilet;
import ro.ase.cts.F10_Strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet(10);
        bilet.platesteBilet();
        bilet.setModPlata(new PlataSMS());
        bilet.platesteBilet();
    }
}
