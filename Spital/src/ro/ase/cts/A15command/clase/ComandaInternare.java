package ro.ase.cts.A15command.clase;

public class ComandaInternare implements IComanda{
    private Doctor doctor;
    private int nrZile;

    public ComandaInternare(Doctor doctor, int nrZile) {
        this.doctor = doctor;
        this.nrZile = nrZile;
    }

    @Override
    public void executa() {
        doctor.interneazaPacient();
    }
}
