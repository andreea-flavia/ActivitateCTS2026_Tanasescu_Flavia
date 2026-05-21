package ro.ase.cts.F11_Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Sistem implements ISistem {
    private List<ICalator> calatori;

    public Sistem() {
        this.calatori = new ArrayList<ICalator>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (ICalator c : calatori) {
            c.receptioneazaMesaj(mesaj);
        }
    }

    @Override
    public void aboneaza(Calator calator) {
        calatori.add(calator);
    }

    @Override
    public void dezaboneaza(Calator calator) {
        calatori.remove(calator);
    }

    public void notificarePlecareCapat(){
        this.trimiteMesaj("Autobuzul a plecat de la capatul de linie!");
    }
}
