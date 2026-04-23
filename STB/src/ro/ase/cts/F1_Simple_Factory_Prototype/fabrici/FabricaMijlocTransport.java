package ro.ase.cts.F1_Simple_Factory_Prototype.fabrici;

import ro.ase.cts.F1_Simple_Factory_Prototype.clase.Autobuz;
import ro.ase.cts.F1_Simple_Factory_Prototype.clase.MijlocTransport;
import ro.ase.cts.F1_Simple_Factory_Prototype.clase.Tramvai;
import ro.ase.cts.F1_Simple_Factory_Prototype.clase.Troleibuz;

public class FabricaMijlocTransport {
    public MijlocTransport creareMijlocTrasnport(TipMijlocTransport tip, String numeMijloc, double pretBilet){
        if(tip == TipMijlocTransport.AUTOBUZ){
            return new Autobuz(pretBilet, numeMijloc);
        }
        if(tip == TipMijlocTransport.TRAMVAI){
            return new Tramvai(pretBilet, numeMijloc, "-");
        }
        if(tip == TipMijlocTransport.TROLEIBUZ){
            return new Troleibuz(pretBilet, numeMijloc);
        }
        return null;
    }
}
