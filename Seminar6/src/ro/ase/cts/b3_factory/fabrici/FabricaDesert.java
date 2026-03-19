package ro.ase.cts.b3_factory.fabrici;

import ro.ase.cts.b3_factory.clase.Clatite;
import ro.ase.cts.b3_factory.clase.FelMancare;
import ro.ase.cts.b3_factory.clase.Papanasi;
import ro.ase.cts.b3_factory.enums.TipDesert;
import ro.ase.cts.b3_factory.enums.TipFelMancare;

public class FabricaDesert implements FabricaFelMancare {
    @Override
    public FelMancare creareFelMancare(TipFelMancare tip, int gramaj, double pret, int calorii) {
       return switch (tip){
           case TipDesert.PAPANASI -> new Papanasi(gramaj, pret, calorii);
           case TipDesert.CLATITE -> new Clatite(gramaj, pret, calorii);
           default -> null;
       };
    }

    @Override
    public FelMancare creareFelMancare(TipFelMancare tip, int gramaj, double pret) {
        return creareFelMancare(tip, gramaj, pret, 150);
    }
}
