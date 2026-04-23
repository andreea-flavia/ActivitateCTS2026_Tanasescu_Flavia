package ro.ase.cts.A6_Facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private boolean paturiLibere[]; //vector deoarece avem o lungime predefinita


    public Salon() {
        this.paturiLibere = new boolean[10];
        this.paturiLibere[1] = true;
        this.paturiLibere[4] = true;
        this.paturiLibere[7] = true;
        this.paturiLibere[8] = true;
        this.paturiLibere[9] = true;
    }

    public int getPatLiber(){
        for (int i = 0; i< this.paturiLibere.length; i++) {
            if (this.paturiLibere[i]) {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int idPat){
        this.paturiLibere[idPat] = true;
    }
}
