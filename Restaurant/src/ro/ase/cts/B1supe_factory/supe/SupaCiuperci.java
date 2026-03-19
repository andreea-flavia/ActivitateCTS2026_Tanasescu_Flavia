package ro.ase.cts.B1supe_factory.supe;

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
