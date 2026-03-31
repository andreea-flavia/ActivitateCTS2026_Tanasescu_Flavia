package ro.ase.cts.A2Simple_Factory.main;

import ro.ase.cts.A2Simple_Factory.clase.PersonalSpital;
import ro.ase.cts.A2Simple_Factory.factory.PersonalSpitalFactory;
import ro.ase.cts.A2Simple_Factory.factory.TipPersonalSpital;

public class program {
    public static void main(String[] args){
        PersonalSpitalFactory factory = new PersonalSpitalFactory();
        PersonalSpital brancardier = factory.crearePersonalSpital(TipPersonalSpital.BRANCARDIER, "Tanasescu Flavia", 25, 9500);
        brancardier.afisareDescrierePersonalSpital();
    }
}
