package ro.ase.cts.F12_ChainOfResp.clase;

public abstract class Handler {
    Handler urmRecomandare = null;

    public void setUrmRecomandare(Handler urmRecomandare) {
        this.urmRecomandare = urmRecomandare;
    }

    public abstract void recomanda(Calator c);
}
