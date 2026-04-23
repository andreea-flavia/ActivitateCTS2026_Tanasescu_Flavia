package others.cafenea.main;

import others.cafenea.clase.Bautura;
import others.cafenea.fabrici.FabricaBautura;
import others.cafenea.fabrici.TipBautura;
import others.cafenea.prototype.BauturaPresetata;
import others.cafenea.singleton.ProgramFidelitate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        FabricaBautura fabrica = new FabricaBautura();
        Bautura cafea = fabrica.creareBautura(TipBautura.CAFEA, "Latte Machiatto", 250, 19.5);

        System.out.println(cafea.getDetalii());
        cafea.preparare();

        //    Prototype
        BauturaPresetata bautura1 = new BauturaPresetata("Latte", 350, 21);
        BauturaPresetata bautura2 = (BauturaPresetata) bautura1.copiaza();

        bautura1.afiseazaDetalii();
        bautura2.setVolum(270);
        bautura2.setNume("Latte cu caramel");
        bautura2.afiseazaDetalii();

        BauturaPresetata bautura3 = new BauturaPresetata("Ceai verde", 180, 15);

        List<BauturaPresetata> bauturi = new ArrayList<BauturaPresetata>();
        bauturi.add(bautura3);
        bauturi.add(bautura1);
        bauturi.add(bautura2);

        ProgramFidelitate program1 = ProgramFidelitate.getProgramFidelitate("Pastele", bauturi);
        program1.afiseazaDetalii();

        ProgramFidelitate program2 = ProgramFidelitate.getProgramFidelitate("Craciun", bauturi);
        program2.afiseazaDetalii();

    }




}
