package ro.ase.cts.A7decorator;

import ro.ase.cts.A7decorator.clase.IRezultat;
import ro.ase.cts.A7decorator.clase.Rezultat;
import ro.ase.cts.A7decorator.decorator.Decorator;
import ro.ase.cts.A7decorator.decorator.DecoratorOnline;

public class Main {
    public static void main(String[] args) {
        IRezultat rezultat = new Rezultat("Flavi", "19052026");
        rezultat.afiseaza();

        Decorator deco = new DecoratorOnline(rezultat);
        deco.afiseazaOnline();
    }
}
