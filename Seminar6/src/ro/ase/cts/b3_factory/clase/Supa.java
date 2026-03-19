package ro.ase.cts.b3_factory.clase;

public abstract class Supa implements FelMancare {
    int gramaj;
    double pret;

    public Supa(double pret, int gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
