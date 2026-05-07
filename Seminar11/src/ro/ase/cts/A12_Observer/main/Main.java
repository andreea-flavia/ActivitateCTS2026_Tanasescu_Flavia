package ro.ase.cts.A12_Observer.main;

import ro.ase.cts.A12_Observer.clase.ISpital;
import ro.ase.cts.A12_Observer.clase.Pacient;
import ro.ase.cts.A12_Observer.clase.PacientInternat;
import ro.ase.cts.A12_Observer.clase.Spital;


public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientInternat("Flavi",20);
        Pacient pacient2 = new PacientInternat("Ducu",67);
        Pacient pacient3 = new PacientInternat("Niko",12);
        ISpital spital = new Spital("Spital Baneasa");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        ((Spital)spital).notificaPandemie();
        System.out.println("-----------------------");
        ((Spital)spital).notificaVirus();
    }
}