package ro.ase.cts.B10flyweight.clase;

public class Client implements IClient {
    private String numeClient;
    private String nrTelefon;
    private String adresaMail;

    public Client(String numeClient, String nrTelefon, String adresaMail) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaMail='").append(adresaMail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaRezervareClient(Rezervare rezervare) {
        StringBuilder sb = new StringBuilder("\nRezervarea curenta:");
        sb.append(rezervare.toString());
        sb.append(" \nPentru clientul :");
        sb.append(this.toString());
        System.out.print(sb.toString());
    }
}
