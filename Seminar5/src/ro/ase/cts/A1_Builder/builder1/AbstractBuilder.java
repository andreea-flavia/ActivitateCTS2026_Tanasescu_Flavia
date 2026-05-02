package ro.ase.cts.A1_Builder.builder1;

public interface AbstractBuilder {
    Internare build();

    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejun(boolean micDejun);
    AbstractBuilder setPapuci(boolean papuci);
    AbstractBuilder setHalat(boolean halat);
}
