package ro.ase.cts.F9_Flyweight.main;

import ro.ase.cts.F9_Flyweight.clase.Autobuz;
import ro.ase.cts.F9_Flyweight.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes",2001,89);
        Autobuz autobuz2 = new Autobuz("BMW",2021,135);
        Autobuz autobuz3 = new Autobuz("Dacia",2010,78);
        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinie(243,"Universitate","Titan").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(70,"Dristor","Pantelimon").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102,"Militari","Baneasa").afiseazaAutobuzLinie(autobuz3);
    }
}
