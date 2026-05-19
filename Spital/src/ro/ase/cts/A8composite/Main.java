package ro.ase.cts.A8composite;

import ro.ase.cts.A8composite.clase.Departament;
import ro.ase.cts.A8composite.clase.IStructura;
import ro.ase.cts.A8composite.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura spital = new Departament("Spital");
        IStructura urgente = new Departament("Urgente");
        IStructura cardio = new Departament("Cardio");

        IStructura sectie1 = new Sectie("Sectie 1");
        IStructura sectie2 = new Sectie("Sectie 2");
        IStructura sectie3 = new Sectie("Sectie 3");
        IStructura sectie4 = new Sectie("Sectie 4");

        ((Departament) spital).adaugaSubdep(urgente);
        ((Departament) spital).adaugaSubdep(cardio);

        ((Departament) urgente).adaugaSubdep(sectie1);
        ((Departament) urgente).adaugaSubdep(sectie2);
        ((Departament) cardio).adaugaSubdep(sectie3);
        ((Departament) cardio).adaugaSubdep(sectie4);

        spital.afiseazaDetalii("   ");
    }
}
