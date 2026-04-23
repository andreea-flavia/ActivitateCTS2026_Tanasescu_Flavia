package ro.ase.cts.A5_Adapter.clase.spital;

import ro.ase.cts.A5_Adapter.clase.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {
    ro.ase.cts.A5_Adapter.clase.spital.Medicament m_spital;

    public MedicamentAdapter(ro.ase.cts.A5_Adapter.clase.spital.Medicament m_spital) {
        super(m_spital.getNumeMedicament());
        this.m_spital = m_spital;
    }

    @Override
    public void cumparaMedicament() {

    }
}
