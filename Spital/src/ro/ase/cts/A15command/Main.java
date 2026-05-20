package ro.ase.cts.A15command;

import ro.ase.cts.A15command.clase.*;

public class Main {
    public static void main(String[] args) {
        Operator op = new Operator();
        Doctor doctor = new Doctor("Flavi");
        IComanda comanda = new ComandaInternare(doctor, 3);
        IComanda comanda2 = new ComandaInternare(doctor, 4);
        IComanda comanda3 = new ComandaTratare(doctor);

        op.adaugaComanda(comanda);
        op.adaugaComanda(comanda2);
        op.adaugaComanda(comanda3);

        op.executaComanda();
        op.executaComanda();
        op.executaComanda();
        op.executaComanda();
    }
}
