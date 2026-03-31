package ro.ase.cts.A3Factory_Method.factory;

import ro.ase.cts.A3Factory_Method.clase.PersonalSpital;
import ro.ase.cts.A3Factory_Method.enums.TipPersonalSpital;

public interface PersonalSpitalFactory {
    PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu);
    PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String numePersonal, int aniExperienta, double salariu, String domeniu);
}
