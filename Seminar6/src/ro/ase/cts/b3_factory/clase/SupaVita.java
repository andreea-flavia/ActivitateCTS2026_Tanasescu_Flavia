package ro.ase.cts.b3_factory.clase;

public class SupaVita extends Supa{
    public SupaVita(double pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareFelMancare() {
        System.out.println("Supa de Vita: " + super.toString());
    }
}
