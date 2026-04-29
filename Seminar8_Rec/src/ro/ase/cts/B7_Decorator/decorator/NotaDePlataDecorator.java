package ro.ase.cts.B7_Decorator.decorator;

import ro.ase.cts.B7_Decorator.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlataA;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlataA) {
        this.notaDePlataA = notaDePlataA;
    }

    @Override
    public void printeaza() {
        notaDePlataA.printeaza();
    }

    public abstract void printeazaFelicitare();


}
