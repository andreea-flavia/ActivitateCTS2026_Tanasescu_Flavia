package ro.ase.cts.A10flyweight;

import ro.ase.cts.A10flyweight.clase.Pacient;
import ro.ase.cts.A10flyweight.clase.PacientFactory;
import ro.ase.cts.A10flyweight.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Flavi", "1234567890", "Acasa");

        Salon s1 = new Salon(1,2,10);
        PacientFactory pf = new PacientFactory();
        pf.getPacient("Flavi", "1234567890", "Acasa").afisareSalon(s1);
    }
}
