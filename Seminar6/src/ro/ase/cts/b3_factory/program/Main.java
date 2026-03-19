package ro.ase.cts.b3_factory.program;

import ro.ase.cts.b3_factory.clase.FelMancare;
import ro.ase.cts.b3_factory.enums.TipDesert;
import ro.ase.cts.b3_factory.enums.TipSupa;
import ro.ase.cts.b3_factory.fabrici.FabricaDesert;
import ro.ase.cts.b3_factory.fabrici.FabricaFelMancare;
import ro.ase.cts.b3_factory.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelMancare fabricaFelMancare = new FabricaSupa();
        FelMancare supaLegume = fabricaFelMancare.creareFelMancare(TipSupa.SUPA_LEGUME, 250, 17);
        FelMancare supaVita = fabricaFelMancare.creareFelMancare(TipSupa.SUPA_VITA, 300, 25);

        fabricaFelMancare = new FabricaDesert();
        FelMancare papanasi =fabricaFelMancare.creareFelMancare(TipDesert.PAPANASI, 300, 30, 300);
        FelMancare clatite =fabricaFelMancare.creareFelMancare(TipDesert.CLATITE, 277, 20, 500);

        supaLegume.afisareFelMancare();
        supaVita.afisareFelMancare();
        papanasi.afisareFelMancare();
        clatite.afisareFelMancare();
    }
}
