package ro.ase.cts.B15command.clase;

public class ComandaRezervare implements IComanda {
    private Masa masa;
    private int nrPersoane;

    public ComandaRezervare(Masa masa, int nrPersoane) {
        this.masa = masa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void executa() {
        masa.rezervaMasa(nrPersoane);
    }
}
