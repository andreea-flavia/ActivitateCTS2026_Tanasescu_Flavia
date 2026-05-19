package ro.ase.cts.B7decorator.decorator;

import ro.ase.cts.B7decorator.clase.INotaDePlata;

public class DecoratorPasteFericit extends Decorator {
    public DecoratorPasteFericit(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("CRACIUN FERICIT!");
    }
}
