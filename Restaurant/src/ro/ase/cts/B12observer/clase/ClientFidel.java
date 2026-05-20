package ro.ase.cts.B12observer.clase;

public class ClientFidel implements IClientFidel {
    private String numeClient;
    private int varstaClient;

    public ClientFidel(String numeClient, int varstaClient) {
        this.numeClient = numeClient;
        this.varstaClient = varstaClient;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Client FIDEL " + this.numeClient + " - " + mesaj);
    }
}
