package ro.ase.cts.A3Factory_Method.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String numePersonal, int aniExperienta, double salariu, String domeniu) {
        super(numePersonal, aniExperienta, salariu, domeniu);
    }

    @Override
    public void afisarePersonalSpital() {
        System.out.println("Registrator");
        System.out.println(super.toString());
    }
}
