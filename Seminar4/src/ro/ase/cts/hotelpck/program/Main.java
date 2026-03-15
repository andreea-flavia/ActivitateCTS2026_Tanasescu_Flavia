package ro.ase.cts.hotelpck.program;

import ro.ase.cts.hotelpck.hotel.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hote1 = Hotel.getInstance("Hotel 1", 2, 4);
        Hotel hote2 = Hotel.getInstance("Hotel 2", 6, 20);

        hote1.inchiriazaCamera();
        hote1.inchiriazaCamera();

        hote2.inchiriazaCamera();
        hote2.inchiriazaCamera();
    }
}
