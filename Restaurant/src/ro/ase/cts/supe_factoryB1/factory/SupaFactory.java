package ro.ase.cts.supe_factoryB1.factory;

import ro.ase.cts.supe_factoryB1.supe.Supa;
import ro.ase.cts.supe_factoryB1.supe.SupaVita;

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
