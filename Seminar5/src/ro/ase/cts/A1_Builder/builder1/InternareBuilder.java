package ro.ase.cts.A1_Builder.builder1;

public class InternareBuilder implements  AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String nume) {
        internare = new Internare(nume, false,false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNumePacient(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejun(boolean micDejun) {
        this.internare.setMicDejunInclus(micDejun);
        return this;
    }

    @Override
    public AbstractBuilder setPapuci(boolean papuci) {
        this.internare.setPapuciDeCamera(papuci);
        return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }
}
