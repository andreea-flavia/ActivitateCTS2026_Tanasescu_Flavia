package ro.ase.cts.A12observer;

import ro.ase.cts.A12observer.clase.Pacient;
import ro.ase.cts.A12observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Flavi",21);
        Pacient pacient2 = new Pacient("Ducu",24);
        Pacient pacient3 = new Pacient("Niko",22);
        Spital spital = new Spital("Obregia");
        spital.aboneazaPacient(pacient);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        spital.notificareVirus();

    }
}
