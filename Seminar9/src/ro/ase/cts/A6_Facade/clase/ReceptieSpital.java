package ro.ase.cts.A6_Facade.clase;

//implementam Facade

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if(pacient.getGravitateStare() > 7){
            if(medic.areInregistratPacientul(pacient)){
                int patLiber = salon.getPatLiber();

                System.out.println("pat liber:" + patLiber);
                if(patLiber != -1 ){
                    System.out.println("Pacientul " + pacient.getNumePacient() + " este internat la patul " + patLiber);
                    salon.ocupaPat(patLiber);
                }
                else{ System.out.println("Nu exista paturi libere pentru internare"); }
            } else{ System.out.println("Revino cu trimitere de la medicul de familie"); }
        } else{  System.out.println("Starea nu e atat de grava hahahahahahaha"); }
    }
}
