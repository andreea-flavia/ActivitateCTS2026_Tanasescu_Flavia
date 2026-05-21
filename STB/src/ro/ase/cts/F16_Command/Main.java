package ro.ase.cts.F16_Command;

import ro.ase.cts.F16_Command.clase.Autobuz;
import ro.ase.cts.F16_Command.clase.ComandaPlecare;
import ro.ase.cts.F16_Command.clase.IComanda;
import ro.ase.cts.F16_Command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("A1");
        Autobuz a2 = new Autobuz("A2");
        Autobuz a3 = new Autobuz("A3");

        IComanda com1 = new ComandaPlecare(a1, 123);
        IComanda com2 = new ComandaPlecare(a2, 567);
        IComanda com3 = new ComandaPlecare(a3, 980);

        Operator op = new Operator("Flavi");
        op.adaugaComanda(com1);
        op.adaugaComanda(com2);
        op.adaugaComanda(com3);

        op.executa();
        op.executa();
        op.executa();
    }
}
