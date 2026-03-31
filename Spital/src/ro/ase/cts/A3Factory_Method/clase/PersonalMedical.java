package ro.ase.cts.A3Factory_Method.clase;

public abstract class PersonalMedical implements PersonalSpital {
    String numePersonal;
    int aniExperienta;
    double salariu;

    public PersonalMedical(String numePersonal, int aniExperienta, double salariu) {
        this.numePersonal = numePersonal;
        this.aniExperienta = aniExperienta;
        this.salariu = salariu;
    }

    public PersonalMedical() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("numePersonal='").append(numePersonal).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
