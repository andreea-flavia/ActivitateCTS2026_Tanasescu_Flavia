package ro.ase.cts.F11_Observer.clase;

public interface ISistem {
    void trimiteMesaj(String mesaj);
    void aboneaza(Calator calator);
    void dezaboneaza(Calator calator);
}
