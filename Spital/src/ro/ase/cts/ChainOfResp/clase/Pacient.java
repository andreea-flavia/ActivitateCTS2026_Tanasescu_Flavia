package ro.ase.cts.ChainOfResp.clase;

public class Pacient {
    private String numePacient;
    private int gravitateStare;

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
