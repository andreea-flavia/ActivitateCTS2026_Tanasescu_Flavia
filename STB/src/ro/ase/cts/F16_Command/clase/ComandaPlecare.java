package ro.ase.cts.F16_Command.clase;

public class ComandaPlecare implements IComanda{
    private Autobuz autobuz;
    private int nrLinie;

    public ComandaPlecare(Autobuz autobuz,int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void executaComanda() {
        autobuz.pleacaPeLinie(this.nrLinie);
    }
}
