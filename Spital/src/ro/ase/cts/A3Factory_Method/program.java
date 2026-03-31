package ro.ase.cts.A3Factory_Method;

import ro.ase.cts.A2Simple_Factory.factory.TipPersonalSpital;
import ro.ase.cts.A3Factory_Method.clase.PersonalSpital;
import ro.ase.cts.A3Factory_Method.enums.PersonalMedical;
import ro.ase.cts.A3Factory_Method.enums.PersonalNonMedical;
import ro.ase.cts.A3Factory_Method.factory.PersonalMedicalFactory;
import ro.ase.cts.A3Factory_Method.factory.PersonalNonMedicalFactory;
import ro.ase.cts.A3Factory_Method.factory.PersonalSpitalFactory;

public class program {
    public static void main(String[] args){
        PersonalSpitalFactory factory = new PersonalMedicalFactory();
        PersonalSpital medic = factory.crearePersonalSpital(PersonalMedical.MEDIC, "Ion Popescu", 20, 25000);
        PersonalSpital asistent = factory.crearePersonalSpital(PersonalMedical.ASISTENT, "Andreea Vasile", 13, 13450);
        PersonalSpital brancardier = factory.crearePersonalSpital(PersonalMedical.BRANCARDIER, "Apostu Ducu", 7,  4500);

        PersonalSpitalFactory factory2 = new PersonalNonMedicalFactory();
        PersonalSpital secretar = factory2.crearePersonalSpital(PersonalNonMedical.SECRETAR, "Ilinca Doroftei", 10, 7600, "HR");
        PersonalSpital registrator = factory2.crearePersonalSpital(PersonalNonMedical.REGISTRATOR, "Flavia Tanasescu", 67, 6969, "Nu stiu");

        medic.afisarePersonalSpital();
        brancardier.afisarePersonalSpital();
        asistent.afisarePersonalSpital();
        secretar.afisarePersonalSpital();
        registrator.afisarePersonalSpital();

    }
}
