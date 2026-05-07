package ro.ase.cts.F16_Command.clase;

public class Plecare implements Comanda{
    private Autobuz autobuz;
    private int nrLinie;

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void pleacaInCursa() {
        autobuz.pornestePeTraseu(nrLinie);
    }
}
