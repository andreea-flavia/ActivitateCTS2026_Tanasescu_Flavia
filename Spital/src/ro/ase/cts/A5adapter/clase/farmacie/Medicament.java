package ro.ase.cts.A5adapter.clase.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaMedicament(){
        System.out.println("Ai cumparat medicamentul "+ this.numeMedicament);
    }
}
