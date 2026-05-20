package ro.ase.cts.A15command.clase;

public class ComandaTratare implements IComanda {
    private Doctor doctor;

    public ComandaTratare(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void executa() {
        doctor.trateazaPacient();
    }
}
