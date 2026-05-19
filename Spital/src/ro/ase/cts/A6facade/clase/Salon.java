package ro.ase.cts.A6facade.clase;

public class Salon {
    private boolean paturiLibere[];

    public Salon() {
        this.paturiLibere = new boolean[10];
        this.paturiLibere[0] = true;
        this.paturiLibere[3] = true;
        this.paturiLibere[4] = true;
        this.paturiLibere[7] = true;
        this.paturiLibere[9] = true;
    }

    public boolean verificaDisponibilitatePat(int indexPat){
        if(indexPat > 0 && indexPat < paturiLibere.length){
            return paturiLibere[indexPat];
        }
        return false;
    }

    public void ocupaPat(int indexPat){
        paturiLibere[indexPat]=false;
    }

}
