package ro.ase.cts.b4_prototype;

public class Rezervare implements IRezervare {
    private String numeClient;
    private int nrPersoane;
    private int oraRezervare; //[1,24]
    private String nrTelefon;


    public Rezervare(String numeClient, int nrPersoane, int oraRezervare, String nrTelefon) {
        if(numeClient.length() >= 3)
            this.numeClient = numeClient;
        else
            this.numeClient = "Client";

        if(nrPersoane > 0)
            this.nrPersoane = nrPersoane;
        else
            this.nrPersoane = 0;

        if(oraRezervare >= 1 && oraRezervare <= 24)
            this.oraRezervare = oraRezervare;
        else
            this.oraRezervare = 1;

        if(nrTelefon.length() == 10)
            this.nrTelefon = nrTelefon;
        else
            this.nrTelefon = "1234567890";
    }

    private Rezervare() { }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    @Override
    public IRezervare copiaza() {
        Rezervare clona = new Rezervare();
        clona.numeClient = this.numeClient;
        clona.nrPersoane = this.nrPersoane;
        clona.oraRezervare = this.oraRezervare;
        clona.nrTelefon = this.nrTelefon;
        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void afisareRezervare(){
        System.out.println(this.toString());
    }

}
