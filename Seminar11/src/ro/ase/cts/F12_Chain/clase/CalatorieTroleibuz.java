package ro.ase.cts.F12_Chain.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 3) {
            return "Troleibuz";
        }
        return super.calatorieHandler.recomandaCalatorie(distanta);
    }
}
