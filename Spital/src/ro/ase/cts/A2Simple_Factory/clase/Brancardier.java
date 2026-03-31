package ro.ase.cts.A2Simple_Factory.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String numePersonal, int aniExperienta, double salariu) {
        super(numePersonal, aniExperienta, salariu);
    }

    @Override
    public void afisareDescrierePersonalSpital() {
        System.out.println("Brancardier");
        System.out.println(super.toString());
    }
}
