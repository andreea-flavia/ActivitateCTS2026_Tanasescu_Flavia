package ro.ase.cts.A9proxy;

import ro.ase.cts.A9proxy.clase.Pacient;
import ro.ase.cts.A9proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        Pacient p2 = new Pacient("Flavi", false);

        p2.internarePacient();
        Proxy proxy = new Proxy(p2);
        proxy.internarePacient();
    }
}
