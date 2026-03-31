package ro.ase.cts.A3Factory_Method.factory;

import ro.ase.cts.A3Factory_Method.clase.Asistent;
import ro.ase.cts.A3Factory_Method.clase.Brancardier;
import ro.ase.cts.A3Factory_Method.clase.Medic;
import ro.ase.cts.A3Factory_Method.clase.PersonalSpital;
import ro.ase.cts.A3Factory_Method.enums.PersonalMedical;
import ro.ase.cts.A3Factory_Method.enums.TipPersonalSpital;

public class PersonalMedicalFactory implements PersonalSpitalFactory {
    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu) {
        if(tip == PersonalMedical.MEDIC) {
            return new Medic(numePersonal, aniExperienta, salariu);
        }
        if(tip == PersonalMedical.ASISTENT) {
            return new Asistent(numePersonal, aniExperienta, salariu);
        }
        if(tip == PersonalMedical.BRANCARDIER) {
            return new Brancardier(numePersonal, aniExperienta, salariu);
        }
        return null;
    }

    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu, String domeniu) {
        return crearePersonalSpital(tip, numePersonal, aniExperienta, salariu);
    }
}
