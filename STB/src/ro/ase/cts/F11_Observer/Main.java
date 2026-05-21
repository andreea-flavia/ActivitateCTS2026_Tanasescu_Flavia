package ro.ase.cts.F11_Observer;

import ro.ase.cts.F11_Observer.clase.Calator;
import ro.ase.cts.F11_Observer.clase.ICalator;
import ro.ase.cts.F11_Observer.clase.ISistem;
import ro.ase.cts.F11_Observer.clase.Sistem;

public class Main {
    public static void main(String[] args) {
        Calator c1 = new Calator("Flavi");
        Calator c2 = new Calator("Duku");
        Calator c3 = new Calator("Niko");

        ISistem sistem = new Sistem();
        sistem.aboneaza(c1);
        sistem.aboneaza(c2);
        sistem.aboneaza(c3);

        ((Sistem)sistem).notificarePlecareCapat();
    }
}
