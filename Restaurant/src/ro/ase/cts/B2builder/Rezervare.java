package ro.ase.cts.B2builder;

public class Rezervare {
    private String numeRezervare;
    private boolean laGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaPersonalizata;
    private String genMuzica;

    public Rezervare() {
        this.numeRezervare = "";
        this.laGeam = false;
        this.scauneErgonomice = false;
        this.decorMasa = false;
        this.muzicaPersonalizata = false;
        this.genMuzica = "Nespecificat";
    }

    public Rezervare(String numeRezervare, boolean laGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaPersonalizata, String genMuzica) {
        this.numeRezervare = numeRezervare;
        this.laGeam = laGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaPersonalizata = muzicaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setNumeRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
    }

    public void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare "+ numeRezervare +" [Geam=" + laGeam + ", Scaune=" + scauneErgonomice +
                ", Decor=" + decorMasa + ", Muzica=" + muzicaPersonalizata +
                ", Gen=" + genMuzica + "]";
    }
}
