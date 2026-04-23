package ro.ase.cts.A5_Adapter.clase.spital;

public class Medicament {
    public String numeMedicament;
    public double pretMedicament;

    public Medicament(String numeMedicament, double pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul " + this.numeMedicament + " a fost achizitionat la pretul de " + this.pretMedicament + " lei");
        }
        else {
            System.out.println("Pentru medicamentul " + this.numeMedicament + " este nevoie de reteta");
        }
    }

    private boolean prezintaReteta(){
        return this.numeMedicament.contains("reteta");
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }
}


