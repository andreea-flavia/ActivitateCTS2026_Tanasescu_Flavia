package ro.ase.cts.B1supe_factory.factory;

import ro.ase.cts.B1supe_factory.supe.Supa;
import ro.ase.cts.B1supe_factory.supe.SupaVita;

public class SupaFactory {

    public Supa getSupa(String denumire, double pret, int calorii, boolean esteVegana, SupaType tip){
        if(tip == SupaType.SUPA_LEGUME){
            return new SupaVita(denumire, pret, calorii, esteVegana);
        }
        if(tip == SupaType.SUPA_CIUPERCI){
            return new SupaVita(denumire, pret, calorii, esteVegana);
        }
        if(tip == SupaType.SUPA_VITA){
            return new SupaVita(denumire, pret, calorii, esteVegana);
        }

        return null;
    }
}
