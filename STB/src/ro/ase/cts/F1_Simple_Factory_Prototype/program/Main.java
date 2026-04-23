package ro.ase.cts.F1_Simple_Factory_Prototype.program;

import ro.ase.cts.F1_Simple_Factory_Prototype.clase.MijlocTransport;
import ro.ase.cts.F1_Simple_Factory_Prototype.clase.Tramvai;
import ro.ase.cts.F1_Simple_Factory_Prototype.fabrici.FabricaMijlocTransport;
import ro.ase.cts.F1_Simple_Factory_Prototype.fabrici.TipMijlocTransport;

public class Main {
    public static void main(String[] args){
        FabricaMijlocTransport fabrica = new FabricaMijlocTransport();
        MijlocTransport autobuz = fabrica.creareMijlocTrasnport(TipMijlocTransport.AUTOBUZ, "Autobuzul Magic", 5);
        MijlocTransport tramvai = fabrica.creareMijlocTrasnport(TipMijlocTransport.TRAMVAI, "Tramvaiul Nou", 5);
        MijlocTransport troleibuz = fabrica.creareMijlocTrasnport(TipMijlocTransport.TROLEIBUZ, "Troleibuzul 69", 5);

        autobuz.afisareDescriere();
        tramvai.afisareDescriere();
        troleibuz.afisareDescriere();

        MijlocTransport autobuz2 = autobuz.clonare();
        autobuz2.setNumeMijloc("Alt autbuz poznas");
        autobuz2.afisareDescriere();

        MijlocTransport tramvai2 = tramvai.clonare();
        ((Tramvai)tramvai2).setCuloare("Fucsia");
        tramvai2.afisareDescriere();
    }
}
