package ro.ase.cts.F1_Simple_Factory_Prototype.clase;

public class Tramvai extends MijlocTransport{
    String culoare;

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Tramvai(double pretBilet, String numeMijloc, String culoare) {
        super(pretBilet, numeMijloc);
        this.culoare = culoare;
    }

    public Tramvai(double pretBilet, String numeMijloc) {
        super(pretBilet, numeMijloc);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Tramvai");
        System.out.println(super.toString()  + " "+  culoare);
    }

    @Override
    public MijlocTransport clonare() {
        Tramvai tramvai = new Tramvai(super.pretBilet, super.numeMijloc);
        tramvai.setCuloare(this.culoare);
        return tramvai;
    }
}
