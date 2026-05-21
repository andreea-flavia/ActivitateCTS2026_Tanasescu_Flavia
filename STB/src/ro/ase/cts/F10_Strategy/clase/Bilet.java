package ro.ase.cts.F10_Strategy.clase;

public class Bilet {
    private int pretBilet;
    private IPlata modPlata;

    public Bilet(int pretBilet) {
        this.pretBilet = pretBilet;
        this.modPlata = new PlataCardBancar();
    }

    public void setModPlata(IPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteBilet(){
        this.modPlata.plateste();
    }
}
