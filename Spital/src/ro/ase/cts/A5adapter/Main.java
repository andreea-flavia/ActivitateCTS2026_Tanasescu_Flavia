package ro.ase.cts.A5adapter;

import ro.ase.cts.A5adapter.clase.farmacie.Medicament;
import ro.ase.cts.A5adapter.clase.spital.AdapterMedicament;

public class Main {
    public static void getMedicament(Medicament medicament){
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        Medicament farmacie = new Medicament("Brufen");
        ro.ase.cts.A5adapter.clase.spital.Medicament spital = new ro.ase.cts.A5adapter.clase.spital.Medicament("Decasept", 20);

        getMedicament(farmacie);
        AdapterMedicament adapter = new AdapterMedicament(spital);
        getMedicament(adapter);
    }
}
