package ro.ase.cts.B0singleton;

public class Program {
    public static void main(String[] args) {
        CasaDeMarcat casa1 = CasaDeMarcat.getInstanta("Casa1", 1000, "RON");
        CasaDeMarcat casa2 = CasaDeMarcat.getInstanta("Casa2", 50, "EUR");

        casa1.plateste(120);
        casa1.plateste(300);

        casa2.plateste(25);
        casa2.plateste(20);

        CasaDeMarcat casa3 = CasaDeMarcat.getInstanta("Casa1", 1000, "RON");

        casa3.plateste(120);
    }
}
