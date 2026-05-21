package ro.ase.cts.F9_FlyWeight.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieHandler {
    private Map<Integer,ILinie> linii;

    public LinieHandler() {
        this.linii = new HashMap<Integer,ILinie>();
    }

    public ILinie getLinie(int nrLinie) {
        if(linii.containsKey(nrLinie)){
            return linii.get(nrLinie);
        }
        ILinie l = new Linie(nrLinie);
        linii.put(nrLinie,l);
        return l;
    }
}
