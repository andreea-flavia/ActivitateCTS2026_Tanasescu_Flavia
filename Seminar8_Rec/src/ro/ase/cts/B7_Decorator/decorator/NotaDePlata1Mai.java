package ro.ase.cts.B7_Decorator.decorator;

import ro.ase.cts.B7_Decorator.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlataA) {
        super(notaDePlataA);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Oferta 1 MAI - REDUCERE 15% la toate produsele!");
    }
}
