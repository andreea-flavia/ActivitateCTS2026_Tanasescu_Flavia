package ro.ase.cts.F4_Adapter;

public class SoftBileteMetrou {
    private int pret;
    private int linie;

    public SoftBileteMetrou(int pret, int linie) {
        this.pret = pret;
        this.linie = linie;
    }

    public int getPret() {
        return pret;
    }

    public void folosesteBilet(){
        System.out.println("Bilet "+this.linie+" in valoare de "+this.pret+" lei - VALIDAT");
    }
}
