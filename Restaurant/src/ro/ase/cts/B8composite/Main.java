package ro.ase.cts.B8composite;

import ro.ase.cts.B8composite.clase.IStructura;
import ro.ase.cts.B8composite.clase.Produs;
import ro.ase.cts.B8composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        IStructura meniu = new Sectiune("Meniu");
        IStructura bauturi = new Sectiune("Bauturi");
        IStructura deserturi = new Sectiune("Deserturi");

        IStructura apa = new Produs("Apa Plata", 5);
        IStructura cafea = new Produs("Cafea", 15);
        IStructura milkshake = new Produs("Milkshake", 13);
        IStructura tiramisu = new Produs("Tiramisu", 19);
        IStructura inghetata = new Produs("Inghetata", 18);

        ((Sectiune) meniu).adaugaProdus(bauturi);
        ((Sectiune) meniu).adaugaProdus(deserturi);

        ((Sectiune) bauturi).adaugaProdus(apa);
        ((Sectiune) bauturi).adaugaProdus(cafea);
        ((Sectiune) bauturi).adaugaProdus(milkshake);
        ((Sectiune) deserturi).adaugaProdus(tiramisu);
        ((Sectiune) deserturi).adaugaProdus(inghetata);

        meniu.afiseaza("    ");
        System.out.println("-----------------");

        ((Sectiune) bauturi).stergeProdus(milkshake);
        ((Sectiune) deserturi).adaugaProdus(milkshake);
        meniu.afiseaza("    ");




    }
}
