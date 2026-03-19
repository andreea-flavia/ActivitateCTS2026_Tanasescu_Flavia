package ro.ase.cts.b3_factory.fabrici;

import ro.ase.cts.b3_factory.clase.FelMancare;
import ro.ase.cts.b3_factory.clase.SupaLegume;
import ro.ase.cts.b3_factory.clase.SupaVita;
import ro.ase.cts.b3_factory.enums.TipFelMancare;
import ro.ase.cts.b3_factory.enums.TipSupa;

public class FabricaSupa implements FabricaFelMancare {
    @Override
    public FelMancare creareFelMancare(TipFelMancare tip, int gramaj, double pret) {
        return switch (tip){
            case TipSupa.SUPA_LEGUME -> new SupaLegume(pret, gramaj);
            case TipSupa.SUPA_VITA -> new SupaVita(pret, gramaj);
            default -> null;
        };
    }

    @Override
    public FelMancare creareFelMancare(TipFelMancare tip, int gramaj, double pret, int calorii) {
        return creareFelMancare(tip, gramaj, pret);
    }
}
