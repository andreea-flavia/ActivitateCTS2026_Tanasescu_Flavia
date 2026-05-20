package ro.ase.cts.ChainOfResp.clase;

public abstract class TriajHandler {
    TriajHandler urmTriaj = null;

    public void setUrmTriaj(TriajHandler urmTriaj) {
        this.urmTriaj = urmTriaj;
    }

    public abstract void trimiteSpreTriaj(Pacient pacient);
}
