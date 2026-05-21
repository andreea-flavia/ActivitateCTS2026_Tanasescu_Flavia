package ro.ase.cts.F4_Adapter;

public class SoftBileteAutobuz {
    private int pretBilet;

    public SoftBileteAutobuz(int pretBilet) {
        this.pretBilet = pretBilet;
    }

    public void valideazaBilet(){
        System.out.println("Bilet in valoare de "+this.pretBilet+" lei - VALIDAT");
    }
}
