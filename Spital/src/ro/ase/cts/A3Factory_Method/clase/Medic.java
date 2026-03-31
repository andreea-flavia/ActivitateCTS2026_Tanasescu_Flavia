package ro.ase.cts.A3Factory_Method.clase;

public class Medic extends PersonalMedical {
    public Medic(String numePersonal, int aniExperienta, double salariu) {
        super(numePersonal, aniExperienta, salariu);
    }

    @Override
    public void afisarePersonalSpital() {
        System.out.println("Medic");
        System.out.println(super.toString());
    }
}
