package ro.ase.cts.F8_Proxy.clase;

public class Proxy implements IAutobuz {
    private Autobuz autobuz;

    public Proxy(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(this.autobuz.getNrPersoane() > 0) {
            this.autobuz.opresteInStatie();
        }
        else{
            System.out.println("Autobuzul este gol - nu se mai opreste");
        }
    }
}
