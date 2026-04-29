package ro.ase.cts.B7_Decorator.decorator;


import ro.ase.cts.B7_Decorator.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator {
    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlataA) {
        super(notaDePlataA);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani 2027 - Dedicatie pentru toti: Dansul pestelui pe uscat!!\n");
    }
}
