package ro.ase.cts.A8_Composite.program;

import ro.ase.cts.A8_Composite.clase.Departament;
import ro.ase.cts.A8_Composite.clase.IStructura;
import ro.ase.cts.A8_Composite.clase.Sectie;

public class Program {
    public static void main(String[] args) {
        IStructura depSpital = new Departament("Spital");
        IStructura depAdmin = new Departament("Administrativ");

        IStructura secSecretariat = new Sectie("Secretariat", 15);
        IStructura secManagement = new Sectie("Management", 17);

        ((Departament) depSpital).adaugaStructura(depAdmin);
        ((Departament) depSpital).adaugaStructura(secManagement);
        ((Departament) depAdmin).adaugaStructura(secSecretariat);

        depSpital.afiseazaDetalii("   ");

        ((Departament) depSpital).stergeStructura(secManagement);
        ((Departament) depAdmin).adaugaStructura(secManagement);
        System.out.println("\n----------------------");
        depSpital.afiseazaDetalii("   ");
    }
}
