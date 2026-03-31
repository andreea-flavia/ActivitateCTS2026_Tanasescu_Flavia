package ro.ase.cts.B2builder;

public class Program {
    public static void main(String[] args) {
        Rezervare r1= new Rezervare();
        r1.setNumeRezervare("Flavi");
        r1.setScauneGeam(true);
        r1.setMuzicaPersonalizata(true);
        r1.setGenMuzica("POP");

        System.out.println(r1.toString());

        Rezervare r2 = new Builder()
                        .setNumeRezervare("Ducu")
                        .setScauneErgonomice(true)
                        .setDecorMasa(true)
                        .build();
        System.out.println(r2.toString());


    }
}
