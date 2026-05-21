package ro.ase.cts.F9_FlyWeight;


import ro.ase.cts.F9_FlyWeight.clase.AutobuzLinie;
import ro.ase.cts.F9_FlyWeight.clase.LinieHandler;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new AutobuzLinie("A1", "Titan", "LiviuRebreanu");
        AutobuzLinie a2 = new AutobuzLinie("A2", "Paris", "Tokyo");

        LinieHandler handler = new LinieHandler();
        handler.getLinie(1).afiseaza(a1);
        handler.getLinie(2).afiseaza(a2);
    }
}
