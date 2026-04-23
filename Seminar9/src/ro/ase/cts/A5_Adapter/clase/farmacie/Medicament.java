package ro.ase.cts.A5_Adapter.clase.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaMedicament (){
        System.out.println("Medicamentul " + this.numeMedicament + " a fost achizitionat");
    }
}
