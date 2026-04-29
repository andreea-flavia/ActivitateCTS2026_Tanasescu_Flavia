package ro.ase.cts.A5_Adapter.main;

import ro.ase.cts.A5_Adapter.clase.farmacie.Medicament;
import ro.ase.cts.A5_Adapter.clase.spital.MedicamentAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void procuraMedicament(Medicament medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament m_farmacie = new Medicament("Decasept");

        ro.ase.cts.A5_Adapter.clase.spital.Medicament m_spital = new ro.ase.cts.A5_Adapter.clase.spital.Medicament("reteta_Insulina", 150.0);

        m_farmacie.cumparaMedicament();
        m_spital.achizitioneazaMedicament();
        System.out.println(" ");

        //2 tipuri de med pe care nu le pot folosi in aceeasi aplicatie pt ca nu il recunoaste
        // -> adapterul va adapta un ob spital la un ob pe care il poate folosi aici
        procuraMedicament(m_farmacie);
        //procuraMedicament(m_spital);

        MedicamentAdapter adapter = new MedicamentAdapter(m_spital);
        procuraMedicament(adapter);
    }
}