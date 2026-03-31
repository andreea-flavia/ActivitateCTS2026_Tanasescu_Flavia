package ro.ase.cts.B2builder;

public class Builder implements IBuilder{
    private Rezervare rezervare;

    public Builder() {
        rezervare = new Rezervare();
    }

    public Builder setNumeRezervare(String numeRezervare) {
        rezervare.setNumeRezervare(numeRezervare);
        return this;
    }

    public Builder setScauneGeam(boolean scauneGeam) {
        rezervare.setScauneGeam(scauneGeam);
        return this;
    }
    public Builder setScauneErgonomice(boolean scauneErgonomice) {
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public Builder setDecorMasa(boolean decorMasa) {
        rezervare.setDecorMasa(decorMasa);
        return this;
    }

    public Builder setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        rezervare.setMuzicaPersonalizata(muzicaPersonalizata);
        return this;
    }

    public Builder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
