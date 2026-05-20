package ro.ase.cts.B15command;

import ro.ase.cts.B15command.clase.ComandaRezervare;
import ro.ase.cts.B15command.clase.Masa;
import ro.ase.cts.B15command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Masa m1 = new Masa(2);
        Masa m2 = new Masa(5);
        Operator operator = new Operator();

        operator.adaugaComanda(new ComandaRezervare(m1,4));
        operator.adaugaComanda(new ComandaRezervare(m2,7));
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
