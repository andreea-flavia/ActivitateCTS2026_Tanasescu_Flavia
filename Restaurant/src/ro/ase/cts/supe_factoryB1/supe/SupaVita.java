package ro.ase.cts.supe_factoryB1.supe;

public class SupaVita extends Supa {
    public SupaVita(String denumire, double pret, int calorii, boolean esteVegana) {
        super(denumire, pret, calorii, esteVegana);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de vita");
        System.out.println(super.toString());
    }
}
