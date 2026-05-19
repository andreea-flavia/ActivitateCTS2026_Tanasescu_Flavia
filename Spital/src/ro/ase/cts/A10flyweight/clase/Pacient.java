package ro.ase.cts.A10flyweight.clase;

public class Pacient implements IPacient{
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void afisareSalon(Salon salon) {
        StringBuilder sb = new StringBuilder("Pacientul ");
        sb.append(nume).append(" este internat in salonul: ");
        sb.append(salon.toString());
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
