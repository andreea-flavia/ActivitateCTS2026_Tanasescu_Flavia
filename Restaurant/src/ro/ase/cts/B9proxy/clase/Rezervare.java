package ro.ase.cts.B9proxy.clase;

public class Rezervare implements IRezervare{
    private String dataRezervare;
    private int nrPersoane;

    public Rezervare(String dataRezervare, int nrPersoane) {
        this.dataRezervare = dataRezervare;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void rezervareMasa() {
        System.out.println("Ai facut o rezervare pentru " + this.nrPersoane + " persoane in data de " + this.dataRezervare);
    }
}
