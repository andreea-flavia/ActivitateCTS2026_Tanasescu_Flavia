package ro.ase.cts.B15command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<IComanda>();
    }

    public void adaugaComanda(IComanda comanda) {
        this.comenzi.add(comanda);
    }

    public void executaComanda() {
        if(comenzi.size() > 0) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
