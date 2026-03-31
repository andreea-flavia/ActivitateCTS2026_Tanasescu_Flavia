package ro.ase.cts.A3Factory_Method.factory;

import ro.ase.cts.A3Factory_Method.clase.PersonalSpital;
import ro.ase.cts.A3Factory_Method.clase.Registrator;
import ro.ase.cts.A3Factory_Method.clase.Secretar;
import ro.ase.cts.A3Factory_Method.enums.PersonalNonMedical;
import ro.ase.cts.A3Factory_Method.enums.TipPersonalSpital;

public class PersonalNonMedicalFactory implements PersonalSpitalFactory {
    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu) {
        return crearePersonalSpital(tip, numePersonal, aniExperienta, salariu, "HR");
    }

    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu, String domeniu) {
        if(tip == PersonalNonMedical.SECRETAR){
            return  new Secretar(numePersonal, aniExperienta, salariu, domeniu);
        }
        if(tip == PersonalNonMedical.REGISTRATOR){
            return  new Registrator(numePersonal, aniExperienta, salariu, domeniu);
        }
        return null;
    }
}
