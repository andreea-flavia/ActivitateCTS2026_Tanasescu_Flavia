package ro.ase.cts.F12_Chain.clase;

public class CalatorieAutobuz extends CalatorieHandler {
    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta  < 5) {
            return "Autobuz";
        }
        return super.calatorieHandler.recomandaCalatorie(distanta);
    }
}
