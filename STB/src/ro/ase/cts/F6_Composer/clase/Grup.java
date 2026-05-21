package ro.ase.cts.F6_Composer.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements IStructura {
    private String numeGrup;
    private List<IStructura> autobuze;

    public Grup(String numeGrup) {
        this.numeGrup = numeGrup;
        this.autobuze = new ArrayList<IStructura>();
    }

    public void adaugaAutobuz(IStructura autobuz) {
        this.autobuze.add(autobuz);
    }

    public void stergeAutobuz(IStructura autobuz) {
        this.autobuze.remove(autobuz);
    }

    @Override
    public void afiseaza(String spatii) {
        System.out.println(spatii + this.numeGrup);
        for (IStructura autobuz : autobuze) {
            autobuz.afiseaza(spatii + "    ");
        }
    }
}
