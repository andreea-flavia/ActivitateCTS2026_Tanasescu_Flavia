package ro.ase.cts.A7decorator.decorator;

import ro.ase.cts.A7decorator.clase.IRezultat;

public class DecoratorOnline extends Decorator{
    public DecoratorOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("REZULTATE ONLINE");
    }
}
