package ro.ase.cts.B7decorator.decorator;

import ro.ase.cts.B7decorator.clase.INotaDePlata;

public class DecoratorLaMultiAni extends Decorator {
    public DecoratorLaMultiAni(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("LA MULTI ANI!");
    }
}
