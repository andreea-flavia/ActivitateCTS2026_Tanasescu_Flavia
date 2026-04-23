package others.cafenea.fabrici;

import others.cafenea.clase.Bautura;
import others.cafenea.clase.Cafea;
import others.cafenea.clase.Ceai;
import others.cafenea.clase.CiocolataCalda;

public class FabricaBautura {
    public Bautura creareBautura(TipBautura tip, String nume, int volum, double pret) {
        if (tip == TipBautura.CAFEA) {
            return new Cafea(nume, volum, pret);
        }
        if(tip == TipBautura.CEAI) {
            return new Ceai(nume, volum, pret);
        }
        if(tip==TipBautura.CIOCOLATA_CALDA) {
            return new CiocolataCalda(nume, volum, pret);
        }
        return null;
    }
}
