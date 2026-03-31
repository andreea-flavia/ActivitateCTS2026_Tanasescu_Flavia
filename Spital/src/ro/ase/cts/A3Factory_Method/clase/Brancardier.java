package ro.ase.cts.A3Factory_Method.clase;

public class Brancardier extends PersonalMedical {

    public Brancardier(String numePersonal, int aniExperienta, double salariu) {
        super(numePersonal, aniExperienta, salariu);
    }

    @Override
    public void afisarePersonalSpital() {
        System.out.println("Brancardier");
        System.out.println(super.toString());
    }
}
