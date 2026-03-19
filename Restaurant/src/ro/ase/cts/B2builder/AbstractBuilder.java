package ro.ase.cts.B2builder;

public interface AbstractBuilder {
    Rezervare build();
    AbstractBuilder setLaGeam(boolean laGeam);
    AbstractBuilder setScauneErgonomice(boolean scaune);
    AbstractBuilder setDecorMasa(boolean decor);
    AbstractBuilder setMuzicaPersonalizata(boolean muzica);
    AbstractBuilder setGenMuzica(String gen);
}
