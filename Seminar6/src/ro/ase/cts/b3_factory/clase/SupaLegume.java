package ro.ase.cts.b3_factory.clase;

public class SupaLegume extends Supa{
    public SupaLegume(double pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareFelMancare() {
        System.out.println("Supa de Legume: " + super.toString());
    }
}
