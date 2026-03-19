package ro.ase.cts.b3_factory.clase;

public class Clatite extends Desert{
    public Clatite(int calorii, double pret, double gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clatite{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareFelMancare() {
        System.out.println("Clatite: " + super.toString());
    }
}
