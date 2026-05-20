package ro.ase.cts.B12observer;

import ro.ase.cts.B12observer.clase.ClientFidel;
import ro.ase.cts.B12observer.clase.IRestaurant;
import ro.ase.cts.B12observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        ClientFidel client1 = new ClientFidel("Flavi",21);
        ClientFidel client2 = new ClientFidel("Ducu",22);
        ClientFidel client3 = new ClientFidel("Niko",24);
        IRestaurant restaurant = new Restaurant("La mici");

        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);
        restaurant.aboneazaClient(client3);

        ((Restaurant)restaurant).notificareOferta();
        ((Restaurant)restaurant).notificareProdus();
    }
}
