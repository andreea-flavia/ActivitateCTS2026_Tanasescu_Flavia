package ro.ase.cts.supe_factoryB1.supe;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(String denumire, double pret, int calorii, boolean esteVegana) {
        super(denumire, pret, calorii, esteVegana);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de ciuperci");
        System.out.println(super.toString());
    }
}
