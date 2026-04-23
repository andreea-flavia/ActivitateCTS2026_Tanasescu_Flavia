package others.cafenea.clase;

public class CiocolataCalda extends Bautura{
    public CiocolataCalda(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Preparare Ciocolata: Incalzire lapte, topire tableta ciocolata, mixare");
    }

    @Override
    public String getDetalii() {
        return  "Aceasta este o ciocolata calda: " + super.toString();
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
