package ro.ase.cts.A8composite.clase;

public class Sectie implements IStructura {
    private String numeSectie;

    public Sectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii+this.numeSectie);
    }
}
