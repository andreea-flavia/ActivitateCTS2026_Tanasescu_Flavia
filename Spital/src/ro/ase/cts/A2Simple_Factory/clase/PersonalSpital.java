package ro.ase.cts.A2Simple_Factory.clase;

public abstract class PersonalSpital {
    private String numePersonal;
    private int aniExperienta;
    private double salariu;

    public void afisareDescrierePersonalSpital(){}

    public PersonalSpital(String numePersonal, int aniExperienta, double salariu) {
        this.numePersonal = numePersonal;
        this.aniExperienta = aniExperienta;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("numePersonal='").append(numePersonal).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
