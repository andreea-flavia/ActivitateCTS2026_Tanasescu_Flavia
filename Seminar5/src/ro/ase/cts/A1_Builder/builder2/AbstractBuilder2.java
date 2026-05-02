package ro.ase.cts.A1_Builder.builder2;

public interface AbstractBuilder2 {
    Internare2 build(String nume);
    AbstractBuilder2 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder2 setMicDejun(boolean micDejun);
    AbstractBuilder2 setPapuci(boolean papuci);
    AbstractBuilder2 setHalat(boolean halat);

}
