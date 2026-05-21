package ro.ase.cts.F6_Composer.clase;

public class Autobuz implements IStructura {
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public void afiseaza(String spatii) {
        System.out.println(spatii + this.producator +" - "+ this.model+" - "+this.nrLocuri +" locuri");
    }
}
