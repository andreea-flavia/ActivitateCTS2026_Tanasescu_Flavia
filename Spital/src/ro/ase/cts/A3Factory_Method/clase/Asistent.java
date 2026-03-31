package ro.ase.cts.A3Factory_Method.clase;

public class Asistent extends PersonalMedical {
    public Asistent(String numePersonal, int aniExperienta, double salariu) {
        super(numePersonal, aniExperienta, salariu);
    }

    @Override
    public void afisarePersonalSpital() {
        System.out.println("Asistent");
        System.out.println(super.toString());
    }
}
