package ro.ase.cts.F1_Simple_Factory_Prototype.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(double pretBilet, String numeMijloc) {
        super(pretBilet, numeMijloc);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Troleibuz");
        System.out.println(super.toString());
    }

    @Override
    public MijlocTransport clonare() {
        Troleibuz a = new Troleibuz(super.pretBilet, super.numeMijloc);
        return a;
    }
}
