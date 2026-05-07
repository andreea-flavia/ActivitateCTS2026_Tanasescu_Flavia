package ro.ase.cts.F12_Chain.clase;

public class CalatorieMetrou extends CalatorieHandler{
    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        return "Metrou";
    }
}
