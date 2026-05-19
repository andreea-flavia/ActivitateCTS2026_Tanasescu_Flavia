package ro.ase.cts.B8composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IStructura {
    public String numeSectiune;
    public List<IStructura> produse;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        this.produse = new ArrayList<IStructura>();
    }

    public void adaugaProdus(IStructura structura) {
        this.produse.add(structura);
    }

    public void stergeProdus(IStructura structura) {
        this.produse.remove(structura);
    }

    @Override
    public void afiseaza(String spatii) {
        System.out.println(spatii + this.numeSectiune+":");
        for(IStructura produs: this.produse) {
            produs.afiseaza(spatii+ "      " );
        }
    }
}
