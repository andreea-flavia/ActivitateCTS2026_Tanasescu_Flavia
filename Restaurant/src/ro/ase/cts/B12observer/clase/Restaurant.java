package ro.ase.cts.B12observer.clase;

import ro.ase.cts.B12observer.clase.ClientFidel;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String numeRestaurant;
    private List<ClientFidel> clienti;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.clienti = new ArrayList<ClientFidel>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (ClientFidel client : clienti) {
            client.receptioneazaMesaj(mesaj);
        }
    }

    @Override
    public void aboneazaClient(ClientFidel client) {
        clienti.add(client);
    }

    @Override
    public void dezaboneazaClient(ClientFidel client) {
        clienti.remove(client);
    }

    public void notificareOferta(){
        this.trimiteMesaj("Notificare noua: Oferta 50% pentru studenti!");
    }

    public void notificareProdus(){
        this.trimiteMesaj("Notificare noua: Am introdus antricot de berbecut!");
    }
}
