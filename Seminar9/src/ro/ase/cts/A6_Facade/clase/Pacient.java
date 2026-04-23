package ro.ase.cts.A6_Facade.clase;

public class Pacient {
    private String numePacient;
    private int gravitateStare; //gravitate de la 1 la 10

    public Pacient(String numePacient, int gravitateStare) {
        this.numePacient = numePacient;
        this.gravitateStare = gravitateStare;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getGravitateStare() {
        return gravitateStare;
    }
}
