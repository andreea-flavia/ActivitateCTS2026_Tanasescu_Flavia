package ro.ase.cts.supe_factoryB1.supe;

public class SupaLeguma extends Supa {

    public SupaLeguma(String denumire, double pret, int calorii, boolean esteVegana) {
        super(denumire, pret, calorii, esteVegana);
    }

    @Override
    public void afisareDescriere(){
        System.out.println("Supa de legume");
        System.out.println(super.toString());
    }
}
