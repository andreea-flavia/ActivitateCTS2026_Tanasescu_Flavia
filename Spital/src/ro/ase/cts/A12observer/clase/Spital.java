package ro.ase.cts.A12observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String numeSpital;
    private List<IPacient> pacienti;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        this.pacienti = new ArrayList<IPacient>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IPacient p : this.pacienti) {
            p.receptioneazaMesaj(mesaj);
        }
    }

    @Override
    public void aboneazaPacient(Pacient p) {
        this.pacienti.add(p);
    }

    @Override
    public void dezaboneazaPacient(Pacient p) {
        this.pacienti.remove(p);
    }

    public void notificarePandemie(){
        this.trimiteMesaj("Notificare: PANDEMIE");
    }
    public void notificareVirus(){
        this.trimiteMesaj("Notificare: VIRUS");
    }
}
