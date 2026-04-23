package ro.ase.cts.A6_Facade.clase;

public class Medic {

    public boolean areInregistratPacientul(Pacient pacient){
        return (pacient.getGravitateStare() > 5);
    }

}
