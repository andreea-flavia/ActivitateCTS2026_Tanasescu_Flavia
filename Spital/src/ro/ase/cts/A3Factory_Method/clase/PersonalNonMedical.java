package ro.ase.cts.A3Factory_Method.clase;

public abstract class PersonalNonMedical implements PersonalSpital {
    String numePersonal;
    int aniExperienta;
    double salariu;
    String domeniu;

    public PersonalNonMedical(String numePersonal, int aniExperienta, double salariu, String domeniu) {
        this.numePersonal = numePersonal;
        this.aniExperienta = aniExperienta;
        this.salariu = salariu;
        this.domeniu = domeniu;
    }

    public PersonalNonMedical() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("numePersonal='").append(numePersonal).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", salariu=").append(salariu);
        sb.append(", domeniu='").append(domeniu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
