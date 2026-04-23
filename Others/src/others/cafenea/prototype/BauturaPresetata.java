package others.cafenea.prototype;

import others.cafenea.clase.IBautura;

public class BauturaPresetata implements IBauturaPresetata {
    private String nume;
    private int volum;
    private double pret;

    private BauturaPresetata() {
    }

    public BauturaPresetata(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public IBauturaPresetata copiaza() {
        BauturaPresetata b = new BauturaPresetata();
        b.setNume(nume);
        b.setVolum(volum);
        b.setPret(pret);
        return b;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaDetalii(){
        System.out.println(toString());
    }

}
