package ro.ase.cts.F6_Composer;

import ro.ase.cts.F6_Composer.clase.Autobuz;
import ro.ase.cts.F6_Composer.clase.Grup;
import ro.ase.cts.F6_Composer.clase.IStructura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IStructura> autobuze = new ArrayList<IStructura>();
        IStructura a1 = new Autobuz("Mercedes", "A1", 7);
        IStructura a2 = new Autobuz("Mercedes", "A2", 20);
        IStructura a3 = new Autobuz("Mercedes", "A3", 49);
        IStructura a4 = new Autobuz("Mercedes", "A4", 30);
        autobuze.add(a1);
        autobuze.add(a2);
        autobuze.add(a3);
        autobuze.add(a4);

        IStructura flota = new Grup("Flota");
        IStructura grupMic = new Grup("Grup mic - 10 locuri");
        IStructura grupMediu = new Grup("Grup mediu - 30 locuri");
        IStructura grupMare = new Grup("Grup mare - 50 locuri");

        ((Grup)flota).adaugaAutobuz(grupMic);
        ((Grup)flota).adaugaAutobuz(grupMediu);
        ((Grup)flota).adaugaAutobuz(grupMare);

        for(IStructura a : autobuze) {
            if(((Autobuz)a).getNrLocuri() <= 10){
                ((Grup)grupMic).adaugaAutobuz(a);
            } else if(((Autobuz)a).getNrLocuri() <= 30){
                ((Grup)grupMediu).adaugaAutobuz(a);
            } else {
                ((Grup)grupMare).adaugaAutobuz(a);
            }
        }

        flota.afiseaza("   ");


    }
}
