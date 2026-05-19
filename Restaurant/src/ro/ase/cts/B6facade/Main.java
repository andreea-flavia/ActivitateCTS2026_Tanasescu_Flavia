package ro.ase.cts.B6facade;

import ro.ase.cts.B6facade.clase.Masa;
import ro.ase.cts.B6facade.clase.ReceptieRestaurant;
import ro.ase.cts.B6facade.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Masa m1 = new Masa(5, true, true);
        Masa m2 = new Masa(6, false, true);
        Masa m3 = new Masa(7, true, false);

        ReceptieRestaurant receptie = new ReceptieRestaurant(restaurant);
        receptie.primesteClient(m1);
        receptie.primesteClient(m2);
        receptie.primesteClient(m3);
    }
}
