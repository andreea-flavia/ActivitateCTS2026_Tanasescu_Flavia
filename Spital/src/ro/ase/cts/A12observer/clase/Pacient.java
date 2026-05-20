package ro.ase.cts.A12observer.clase;

public class Pacient implements IPacient {
    private String numePacient;
    private int varsta;

    public Pacient(String numePacient, int varsta) {
        this.numePacient = numePacient;
        this.varsta = varsta;
    }


    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Mesaj: " + mesaj+" - Pacient " + this.numePacient);
    }
}
