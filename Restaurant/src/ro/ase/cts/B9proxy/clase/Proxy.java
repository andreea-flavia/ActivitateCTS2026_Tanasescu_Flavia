package ro.ase.cts.B9proxy.clase;

public class Proxy implements IRezervare {
    private Rezervare rezervare;

    public Proxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervareMasa() {
        if(this.rezervare.getNrPersoane() >= 4){
            this.rezervare.rezervareMasa();
        }
        else {
            System.out.println("Nu este necesare o rezervare! Va asteptam direct la locatie!");
        }
    }
}
