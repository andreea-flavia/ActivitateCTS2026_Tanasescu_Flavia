package ro.ase.cts.B1supe_factory.supe;

public abstract class Supa {
    private String denumire;
    private double pret;
    private int calorii;
    private boolean esteVegana;

    public Supa(String denumire, double pret, int calorii, boolean esteVegana) {
        this.denumire = denumire;
        this.pret = pret;
        this.calorii = calorii;
        this.esteVegana = esteVegana;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Denumire: ").append(denumire).append("\n");
        sb.append("Pret: ").append(pret).append("\n");
        sb.append("Calorii: ").append(calorii).append("\n");
        sb.append("Este vegana: ").append(esteVegana).append("\n");
        return sb.toString();
    }
}
