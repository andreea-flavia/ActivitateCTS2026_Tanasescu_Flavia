package ro.ase.cts.b3_factory.clase;

public class Papanasi extends Desert{
    public Papanasi(int calorii, double pret, double gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanasi{");
        sb.append("calorii=").append(calorii);
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareFelMancare() {
        System.out.println("Papansi: " + super.toString());
    }
}
