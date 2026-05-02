package ro.ase.cts.F8_Proxy.program;

import ro.ase.cts.F8_Proxy.clase.Autobuz;
import ro.ase.cts.F8_Proxy.clase.AutobuzDeNoapte;
import ro.ase.cts.F8_Proxy.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new Autobuz("102", 25);
        mijlocTransport.oprireStatie();
        mijlocTransport.oprireStatie();

        MijlocTransport mijlocTrFaraCalatori = new Autobuz("243", 0);
        mijlocTrFaraCalatori.oprireStatie();

        MijlocTransport autobuzNoapte = new AutobuzDeNoapte(mijlocTrFaraCalatori);
        autobuzNoapte.oprireStatie();
    }
}
