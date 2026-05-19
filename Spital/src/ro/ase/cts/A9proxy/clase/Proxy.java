package ro.ase.cts.A9proxy.clase;

public class Proxy implements IPacient {
    private Pacient pacient;

    public Proxy(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internarePacient() {
        if(pacient.isAreAsigurare()){
            pacient.internarePacient();
        } else {
            System.out.println("Pacientul nu poate fi internat!");
        }
    }
}
