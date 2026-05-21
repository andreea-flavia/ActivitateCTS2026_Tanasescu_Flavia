package ro.ase.cts.F5_Facade.clase;

public class Sofer { //clasa Facade
    private UsaAutobuz usaFata;
    private UsaAutobuz usaMijloc;
    private UsaAutobuz usaSpate;

    public Sofer() {
        this.usaFata = new UsaAutobuz("fata");
        this.usaMijloc = new UsaAutobuz("mijloc");
        this.usaSpate = new UsaAutobuz("spate");
    }

    public void deschideTotLiber(){
        usaFata.deschideLiber();
        usaMijloc.deschideLiber();
        usaSpate.deschideLiber();
    }

    public void deschideTotFortat(){
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
