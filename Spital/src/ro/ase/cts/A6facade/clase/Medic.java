package ro.ase.cts.A6facade.clase;

public class Medic {
    public boolean arePacientInternat(Pacient pacient){
        return (pacient.getGravitate() > 0);
    }
}
