package ro.ase.cts.A8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String numeDep;
    private List<IStructura> sectii;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.sectii = new ArrayList<IStructura>();
    }

    public void adaugaStructura(IStructura structura) {
        this.sectii.add(structura);
    }

    public void stergeStructura(IStructura structura) {
        this.sectii.remove(structura);
    }

    public void getStructura(int index){
        this.sectii.get(index);
    }


    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + "Departament: " + this.numeDep + ", sectii: ");
        for (IStructura structura : this.sectii) {
            structura.afiseazaDetalii(spatii + "   ");
        }
    }
}
