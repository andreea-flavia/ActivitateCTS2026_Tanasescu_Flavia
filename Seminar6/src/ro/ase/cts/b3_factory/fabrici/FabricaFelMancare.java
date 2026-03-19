package ro.ase.cts.b3_factory.fabrici;

import ro.ase.cts.b3_factory.clase.FelMancare;
import ro.ase.cts.b3_factory.enums.TipFelMancare;

public interface FabricaFelMancare {
    FelMancare creareFelMancare(TipFelMancare tip, int gramaj, double pret);
    FelMancare creareFelMancare(TipFelMancare tip, int gramaj, double pret, int calorii);
}
