package ro.ase.cts.A7decorator.clase;

public class Rezultat implements IRezultat{
    private String numePacient;
    private String dataRezultat;

    public Rezultat(String numePacient, String dataRezultat) {
        this.numePacient = numePacient;
        this.dataRezultat = dataRezultat;
    }

    @Override
    public void afiseaza() {
        System.out.println("REZULTATE "+ this.numePacient+ " din date de "+this.dataRezultat );
    }
}
