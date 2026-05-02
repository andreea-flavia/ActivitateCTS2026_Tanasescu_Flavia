package ro.ase.cts.A1_Builder.builder2;

public class InternareBuilder2 implements AbstractBuilder2 {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halat;

    public InternareBuilder2() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halat = false;
    }

    @Override
    public Internare2 build(String nume) {
        return new Internare2(nume,patRabatabil,micDejunInclus,papuciDeCamera,halat);
    }

    @Override
    public AbstractBuilder2 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder2 setMicDejun(boolean micDejun) {
        this.micDejunInclus = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder2 setPapuci(boolean papuci) {
        this.papuciDeCamera = papuci;
        return this;
    }

    @Override
    public AbstractBuilder2 setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }
}
