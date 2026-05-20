package ro.ase.cts.B11strategy;

import ro.ase.cts.B11strategy.clase.Client;
import ro.ase.cts.B11strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Flavi", 150);
        client.plateste();
        client.setModPlata(new PlataCard());
        client.plateste();
    }
}
