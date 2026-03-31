package ro.ase.cts.A2Simple_Factory.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String numePersonal, int aniExperienta, double salariu) {
        super(numePersonal, aniExperienta, salariu);
    }

    @Override
    public void afisareDescrierePersonalSpital() {
        System.out.println("Asistent");
        System.out.println(super.toString());
    }
}
