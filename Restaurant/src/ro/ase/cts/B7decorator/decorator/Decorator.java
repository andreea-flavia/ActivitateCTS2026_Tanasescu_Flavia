package ro.ase.cts.B7decorator.decorator;

import ro.ase.cts.B7decorator.clase.INotaDePlata;

public abstract class Decorator implements INotaDePlata {
    INotaDePlata notaDePlata;

    public Decorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    public abstract void printeazaFelicitare();
}
