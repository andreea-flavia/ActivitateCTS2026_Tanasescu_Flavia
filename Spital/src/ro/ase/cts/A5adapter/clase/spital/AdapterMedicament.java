package ro.ase.cts.A5adapter.clase.spital;

import ro.ase.cts.A5adapter.clase.farmacie.Medicament;

public class AdapterMedicament extends Medicament {
    private ro.ase.cts.A5adapter.clase.spital.Medicament medicament;

    public AdapterMedicament(ro.ase.cts.A5adapter.clase.spital.Medicament medicament) {
        super(medicament.getNumeMedicament());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        this.medicament.achizitioneazaMedicament();
    }
}
