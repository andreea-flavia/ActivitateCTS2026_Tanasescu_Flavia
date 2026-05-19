package ro.ase.cts.A9proxy.clase;

public class Pacient implements IPacient {
    private String numePacient;
    private boolean areAsigurare;

    public Pacient(String numePacient, boolean areAsigurare) {
        this.numePacient = numePacient;
        this.areAsigurare = areAsigurare;
    }

    @Override
    public void internarePacient() {
        System.out.println("INTERNARE PACIENT: " + this.numePacient);
    }

    public String getNumePacient() {
        return numePacient;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
