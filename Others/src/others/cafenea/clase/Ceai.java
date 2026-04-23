package others.cafenea.clase;

public class Ceai extends Bautura{
    public Ceai(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Preparare Ceai: Fierbere apa la 80 grade, infuzare frunze 3 minute");
    }

    @Override
    public String getDetalii() {
        return  "Acesta este un ceai: " + super.toString();
    }

    @Override
    public double getPret() {
        return super.pret;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }
}
