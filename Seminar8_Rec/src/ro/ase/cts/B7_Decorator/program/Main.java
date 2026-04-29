package ro.ase.cts.B7_Decorator.program;


import ro.ase.cts.B7_Decorator.clase.NotaDePlata;
import ro.ase.cts.B7_Decorator.clase.NotaDePlataAbstract;
import ro.ase.cts.B7_Decorator.decorator.NotaDePlata1Mai;
import ro.ase.cts.B7_Decorator.decorator.NotaDePlataDecorator;
import ro.ase.cts.B7_Decorator.decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract nota1 = new NotaDePlata(167, "29.04.2026");
        nota1.printeaza();

        int input = 2;
        NotaDePlataDecorator notaDecorator;

        if(input == 1) {
            notaDecorator = new NotaDePlataNoulAn(nota1);
        } else {
            notaDecorator = new NotaDePlata1Mai(nota1);
        }
        notaDecorator.printeazaFelicitare();





    }
}