package ro.ase.cts.B7decorator;

import ro.ase.cts.B7decorator.clase.INotaDePlata;
import ro.ase.cts.B7decorator.clase.NotaDePlata;
import ro.ase.cts.B7decorator.decorator.Decorator;
import ro.ase.cts.B7decorator.decorator.DecoratorLaMultiAni;
import ro.ase.cts.B7decorator.decorator.DecoratorPasteFericit;

public class Main {
    public static void main(String[] args) {
        INotaDePlata nota1 = new NotaDePlata(100, "21072026");
        nota1.printeaza();

        int input =2;
        Decorator decorator;
        if(input == 1){
            decorator = new DecoratorLaMultiAni(nota1);
        }else {
            decorator = new DecoratorPasteFericit(nota1);
        }

        decorator.printeazaFelicitare();
    }
}
