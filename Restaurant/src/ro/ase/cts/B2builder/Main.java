package ro.ase.cts.B2builder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new RezervareBuilder("Tanasescu Flavia");
        Rezervare r1 = builder
                        .setLaGeam(true)
                        .setScauneErgonomice(true)
                        .build();

        AbstractBuilder builder2 = new RezervareBuilder("Apostu Alexandru");
        Rezervare r2 = builder2
                        .setGenMuzica("Jazz")
                        .setMuzicaPersonalizata(true)
                        .build();

        System.out.println(r1);
        System.out.println(r2);

    }
}
