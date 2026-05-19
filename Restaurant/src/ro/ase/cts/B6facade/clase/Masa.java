package ro.ase.cts.B6facade.clase;

public class Masa {
    private int nrMasa;
    private boolean esteDebarasata;
    private boolean areServeteleNoi;

    public Masa(int nrMasa, boolean esteDebarasata, boolean areServeteleNoi) {
        this.nrMasa = nrMasa;
        this.esteDebarasata = esteDebarasata;
        this.areServeteleNoi = areServeteleNoi;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean idAreServeteleNoi() {
        return areServeteleNoi;
    }
    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }
}
