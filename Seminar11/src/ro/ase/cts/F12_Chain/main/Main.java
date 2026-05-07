package ro.ase.cts.F12_Chain.main;

import ro.ase.cts.F12_Chain.clase.*;


public class Main {
    public static void main(String[] args) {
        CalatorieHandler autobuz = new CalatorieAutobuz();
        CalatorieHandler metrou = new CalatorieMetrou();
        CalatorieHandler tramvai = new CalatorieTramvai();
        CalatorieHandler troleibuz = new CalatorieTroleibuz();

        troleibuz.setCalatorieHandler(autobuz);
        autobuz.setCalatorieHandler(tramvai);
        tramvai.setCalatorieHandler(metrou);

        System.out.println(troleibuz.recomandaCalatorie(5));
        System.out.println(troleibuz.recomandaCalatorie(2));
        System.out.println(troleibuz.recomandaCalatorie(13));
        System.out.println(troleibuz.recomandaCalatorie(9));

    }
}