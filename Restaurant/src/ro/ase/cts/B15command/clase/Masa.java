package ro.ase.cts.B15command.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupaMasa(int nrPersoane){
        System.out.println("Masa #" + nrMasa +" a fost ocupata de " + nrPersoane + " persoane.");
    }

    public void rezervaMasa(int nrPersoane){
        System.out.println("Masa #"+this.nrMasa+" :Ai facut o rezervare pentru " + nrPersoane + " persoane.");
    }
}
