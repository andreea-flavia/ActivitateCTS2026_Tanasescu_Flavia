package ro.ase.cts.F9_FlyWeight.clase;

public class Linie implements ILinie {
    private int nrLinie;

    public Linie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void afiseaza(AutobuzLinie a) {
        StringBuilder sb = new StringBuilder("Autobuzul" + a.getModel());
        sb.append("\nCircula pe linia").append(this.toString());
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append('}');
        return sb.toString();
    }
}
