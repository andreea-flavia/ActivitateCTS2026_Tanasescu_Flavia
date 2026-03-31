package ro.ase.cts.A2Simple_Factory.clase;

public class Medic extends PersonalSpital {
    public Medic(String numePersonal, int aniExperienta, double salariu) {
        super(numePersonal, aniExperienta, salariu);
    }

    @Override
    public void afisareDescrierePersonalSpital() {
        System.out.println("Medic");
        System.out.println(super.toString());
    }
}
