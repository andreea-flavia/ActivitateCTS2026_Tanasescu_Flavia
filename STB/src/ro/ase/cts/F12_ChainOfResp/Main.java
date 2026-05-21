package ro.ase.cts.F12_ChainOfResp;

import ro.ase.cts.F12_ChainOfResp.clase.Autobuz;
import ro.ase.cts.F12_ChainOfResp.clase.Calator;
import ro.ase.cts.F12_ChainOfResp.clase.Handler;
import ro.ase.cts.F12_ChainOfResp.clase.Troleibuz;

public class Main {
    public static void main(String[] args) {
        Calator c1 = new Calator ("Flavi", 5);
        Handler troleibuz = new Troleibuz();
        Handler autobuz = new Autobuz();
        troleibuz.setUrmRecomandare(autobuz);

        troleibuz.recomanda(c1);
    }
}
