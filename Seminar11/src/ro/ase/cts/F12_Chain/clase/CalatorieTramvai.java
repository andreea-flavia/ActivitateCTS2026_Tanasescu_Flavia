package ro.ase.cts.F12_Chain.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta  < 10) {
            return "Tramvai";
        }
        return super.calatorieHandler.recomandaCalatorie(distanta);
    }
}
