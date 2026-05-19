package ro.ase.cts.A7decorator.decorator;

import ro.ase.cts.A7decorator.clase.IRezultat;

public abstract class Decorator implements IRezultat {
    private IRezultat rezultat;

    public Decorator(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afiseaza() {
        rezultat.afiseaza();
    }

    public abstract void afiseazaOnline();

}
