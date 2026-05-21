package ro.ase.cts.F11_Observer.clase;

public class Calator implements ICalator {
    private String numeCalator;

    public Calator(String numeCalator) {
        this.numeCalator = numeCalator;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("NOTIFICARE " + this.numeCalator + ": " + mesaj);
    }
}
