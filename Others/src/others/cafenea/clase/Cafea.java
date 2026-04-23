package others.cafenea.clase;

public class Cafea extends Bautura {
    public Cafea(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Preparare Cafea: Rasnire boabe, extractie espresso, adaugare lapte");
    }

    @Override
    public String getDetalii() {
       return  "Aceasta este o cafea: " + super.toString();
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
