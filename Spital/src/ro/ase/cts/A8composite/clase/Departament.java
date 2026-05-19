package ro.ase.cts.A8composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String numeDepartament;
    private List<IStructura> sectii;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.sectii = new ArrayList<IStructura>();
    }

    public void adaugaSubdep(IStructura structura) {
        this.sectii.add(structura);
    }

    public void stergeSubdep(IStructura structura) {
        this.sectii.remove(structura);
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + this.numeDepartament);
        for (IStructura s: this.sectii){
            s.afiseazaDetalii(spatii + "   ");
        }
    }
}
