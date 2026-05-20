package ro.ase.cts.B11strategy.clase;

public class Client {
    private String numeClient;
    private double totalNota;
    private ModPlata modPlata;

    public Client(String numeClient, double totalNota) {
        this.numeClient = numeClient;
        this.totalNota = totalNota;
        this.modPlata = new PlataCash();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(){
        modPlata.platesteNota();
    }
}
