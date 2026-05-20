package ro.ase.cts.A11strategy;

public class Pacient {
    private String numePacient;
    private int varsta;
    private IPlata modPlata;

    public Pacient(String numePacient, int varsta) {
        this.numePacient = numePacient;
        this.varsta = varsta;
        this.modPlata = new PlataCard();
    }

    public void setModPlata(IPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(){
        this.modPlata.platesteNota();
    }
}
