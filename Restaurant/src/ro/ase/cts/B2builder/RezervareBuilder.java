package ro.ase.cts.B2builder;

public class RezervareBuilder implements AbstractBuilder {
    private Rezervare rezervare;

    public RezervareBuilder(String numeRezervare) {
        rezervare = new Rezervare(numeRezervare, false, false, false, false, "-");
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }

    @Override
    public AbstractBuilder setLaGeam(boolean laGeam) {
        this.rezervare.setLaGeam(laGeam);
        return this;
    }

    @Override
    public AbstractBuilder setScauneErgonomice(boolean scaune) {
        this.rezervare.setScauneErgonomice(scaune);
        return this;
    }

    @Override
    public AbstractBuilder setDecorMasa(boolean decor) {
        this.rezervare.setDecorMasa(decor);
        return this;
    }

    @Override
    public AbstractBuilder setMuzicaPersonalizata(boolean muzica) {
        this.rezervare.setMuzicaPersonalizata(muzica);
        return this;
    }

    @Override
    public AbstractBuilder setGenMuzica(String gen) {
        this.rezervare.setGenMuzica(gen);
        return this;
    }
}
