package ro.ase.cts.A6_Facade.program;

import ro.ase.cts.A6_Facade.clase.Medic;
import ro.ase.cts.A6_Facade.clase.Pacient;
import ro.ase.cts.A6_Facade.clase.ReceptieSpital;
import ro.ase.cts.A6_Facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Flavi", 8);
        Medic medic = new Medic();
        Salon salon = new Salon();

        //fara facade
        if(pacient.getGravitateStare() > 6){
            if(medic.areInregistratPacientul(pacient)){
                int patLiber = salon.getPatLiber();
                if(patLiber != -1 ){
                    System.out.println("Pacientul " + pacient.getNumePacient() + " este internat la patul " + patLiber);
                    salon.ocupaPat(patLiber);
                }
                else{ System.out.println("Nu exista paturi libere pentru internare"); }
            } else{ System.out.println("Revino cu trimitere de la medicul de familie"); }
        } else{  System.out.println("Starea nu e atat de grava hahahahahahaha"); }

        Pacient pacient2 = new Pacient("Niko", 8);
        Pacient pacient3 = new Pacient("Ducu", 10);
        Pacient pacient4 = new Pacient("Rzv", 8);

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);

        receptieSpital.internarePacient(pacient2);
        receptieSpital.internarePacient(pacient3);
        receptieSpital.internarePacient(pacient4);

    }
}
