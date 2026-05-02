package ro.ase.cts.F9_Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer, LinieDeTransport> linie = new HashMap<>();
    public LinieDeTransport getLinie(int nrLinie,String primaLinie,String ultimaLinie) {
        if(this.linie.containsKey(nrLinie)) {
            return this.linie.get(nrLinie);
        }
        LinieDeTransport linieNoua = new Linie(nrLinie,primaLinie,ultimaLinie);
        this.linie.put(nrLinie,linieNoua);
        return linieNoua;
    }
}
