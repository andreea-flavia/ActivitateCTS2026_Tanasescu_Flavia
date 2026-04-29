package ro.ase.cts.A8_Composite.clase;

public class Sectie implements IStructura {
    public String numeSectie;
    public int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetalii(String spatii) {
        System.out.println(spatii + "Sectia "+ this.numeSectie + ": " + this.nrAngajati+ " angajati");
    }
}
