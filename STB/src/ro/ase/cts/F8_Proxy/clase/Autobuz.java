package ro.ase.cts.F8_Proxy.clase;

public class Autobuz implements IAutobuz {
    private int pretBilet;
    private int nrPersoane;

    public Autobuz(int pretBilet, int nrPersoane) {
        this.pretBilet = pretBilet;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul opreste in statie");
    }
}
