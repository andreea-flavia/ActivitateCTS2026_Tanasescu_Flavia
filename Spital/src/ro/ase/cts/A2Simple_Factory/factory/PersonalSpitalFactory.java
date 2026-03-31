package ro.ase.cts.A2Simple_Factory.factory;

import ro.ase.cts.A2Simple_Factory.clase.Asistent;
import ro.ase.cts.A2Simple_Factory.clase.Brancardier;
import ro.ase.cts.A2Simple_Factory.clase.Medic;
import ro.ase.cts.A2Simple_Factory.clase.PersonalSpital;

public class PersonalSpitalFactory {
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu){
        if(tip == TipPersonalSpital.BRANCARDIER){
            return new Brancardier(numePersonal, aniExperienta, salariu);
        }
        if(tip == TipPersonalSpital.ASISTENT){
            return new Asistent(numePersonal, aniExperienta, salariu);
        }
        if(tip == TipPersonalSpital.MEDIC){
            return new Medic(numePersonal, aniExperienta, salariu);
        }
        return null;
    }
}
