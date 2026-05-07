package ro.ase.cts.F16_Command.main;

import ro.ase.cts.F16_Command.clase.Autobuz;
import ro.ase.cts.F16_Command.clase.Comanda;
import ro.ase.cts.F16_Command.clase.Operator;
import ro.ase.cts.F16_Command.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Comanda com1 = new Plecare(new Autobuz("Mercedes", "B987XYZ"), 123);
        Comanda com2 = new Plecare(new Autobuz("BMW", "B123ABC"), 70);

        operator.adaugaComanda(com1);
        operator.adaugaComanda(com2);
        operator.adaugaComanda(new Plecare(new Autobuz("Audi", "B456DEF"), 104));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
