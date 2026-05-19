package ro.ase.cts.B6facade.clase;

public class Restaurant {
    private boolean meseLibere[];

    public Restaurant() {
        this.meseLibere = new boolean[10];
        this.meseLibere[0] = true;
        this.meseLibere[3] = true;
        this.meseLibere[4] = true;
        this.meseLibere[5] = true;
        this.meseLibere[7] = true;
    }

    public boolean esteMasaLibera(int nrMasa){
        if(nrMasa > 0 && nrMasa < this.meseLibere.length){
            return this.meseLibere[nrMasa];
        }
        return false;
    }

    public void ocupaMasa(int nrMasa){
        if(nrMasa > 0 && nrMasa < this.meseLibere.length){
            this.meseLibere[nrMasa] = false;
        }
    }
}
