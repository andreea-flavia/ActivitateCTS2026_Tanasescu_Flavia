package ro.ase.cts.A5adapter.clase.spital;

public class Medicament {
    private String numeMedicament;
    private double pret;

    public Medicament(String numeMedicament, double pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        System.out.println("Ai cumparat medicamentul "+ this.numeMedicament + " la pretul de " + this.pret);
    }

    public void  prezintaReteta(){
        System.out.println("Reteta medicament "+ this.numeMedicament);
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }
}
