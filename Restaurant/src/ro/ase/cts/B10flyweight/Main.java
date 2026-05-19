package ro.ase.cts.B10flyweight;

import ro.ase.cts.B10flyweight.clase.ClientFactory;
import ro.ase.cts.B10flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare r1 = new Rezervare(1,3,"13");
        Rezervare r2 = new Rezervare(2,8,"21");
        Rezervare r3 = new Rezervare(3,7,"18");

        ClientFactory fabrica = new ClientFactory();
        fabrica.getClient("Flavi", "1234567890", "mail@gmail.com").afiseazaRezervareClient(r1);
        fabrica.getClient("Flavi", "1234567890", "mail@gmail.com").afiseazaRezervareClient(r2);
        fabrica.getClient("Flavi", "1234567890", "mail@gmail.com").afiseazaRezervareClient(r3);

    }
}
