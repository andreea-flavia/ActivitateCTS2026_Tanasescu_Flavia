package ro.ase.cts.B9proxy;

import ro.ase.cts.B9proxy.clase.Proxy;
import ro.ase.cts.B9proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("19052026", 2);
        rezervare.rezervareMasa();

        Proxy proxy = new Proxy(rezervare);
        proxy.rezervareMasa();
    }
}
