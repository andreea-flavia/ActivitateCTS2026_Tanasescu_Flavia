package others.cafenea.clase;

public abstract class Bautura implements IBautura {
    String nume;
    int volum;
    double pret;

    public Bautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("pret=").append(pret);
        sb.append(", volum=").append(volum);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
