package ro.ase.cts.B8composite.clase;

public class Produs implements IStructura {
    private String numeProdus;
    private double pret;

    public Produs(String numeProdus, double pret) {
        this.numeProdus = numeProdus;
        this.pret = pret;
    }

    @Override
    public void afiseaza(String spatii) {
        System.out.println(spatii + this.numeProdus+": "+ this.pret + " RON");
    }
}
