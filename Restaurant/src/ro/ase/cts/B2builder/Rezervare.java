package ro.ase.cts.B2builder;

public class Rezervare {
    private String numeRezervare;
    private boolean scauneGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaPersonalizata;
    private String genMuzica;

    public Rezervare() {
    }

    public Rezervare(String numeRezervare, boolean scauneGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaPersonalizata, String genMuzica) {
        super();
        this.numeRezervare = numeRezervare;
        this.scauneGeam = scauneGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaPersonalizata = muzicaPersonalizata;
        this.genMuzica = genMuzica;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeRezervare='").append(numeRezervare).append('\'');
        sb.append(", scauneGeam=").append(scauneGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicaPersonalizata=").append(muzicaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNumeRezervare() {
        return numeRezervare;
    }

    public void setNumeRezervare(String numeRezervare) {
        this.numeRezervare = numeRezervare;
    }

    public boolean isScauneGeam() {
        return scauneGeam;
    }

    public void setScauneGeam(boolean scauneGeam) {
        this.scauneGeam = scauneGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public boolean isDecorMasa() {
        return decorMasa;
    }

    public void setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
    }

    public boolean isMuzicaPersonalizata() {
        return muzicaPersonalizata;
    }

    public void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
