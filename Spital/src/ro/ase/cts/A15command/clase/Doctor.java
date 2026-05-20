package ro.ase.cts.A15command.clase;

public class Doctor {
    private String nume;

    public Doctor(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void interneazaPacient(){
        System.out.println("Pacientul trebuie internat");
    }

    public void trateazaPacient(){
        System.out.println("Pacientul trebuie tratat");
    }
}
