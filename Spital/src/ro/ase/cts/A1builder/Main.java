package ro.ase.cts.A1builder;

public class Main {
    public static void main(String[] args) {
        Internare i1 = new Internare();
        i1.setNumePacient("Tanasescu Flavia");
        i1.afisareDetaliiRezervare();

        Internare i2 = new Builder().setNumePacient("Apostu Alexandru").setPatRabatabil(true).setMicDejunInclus(true)
                .build();
        i2.afisareDetaliiRezervare();
    }
}
