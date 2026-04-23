package ro.ase.cts.F1_Simple_Factory_Prototype.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(double pretBilet, String numeMijloc) {
        super(pretBilet, numeMijloc);
    }

    public Autobuz() {
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuz");
        System.out.println(super.toString());
    }

    @Override
    public MijlocTransport clonare() {
        Autobuz a = new Autobuz(super.pretBilet, super.numeMijloc);
        return a;
    }
}
