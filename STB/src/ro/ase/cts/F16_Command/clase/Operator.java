package ro.ase.cts.F16_Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private String numeOperator;
    private List<IComanda> comenzi;

    public Operator(String numeOperator) {
        this.numeOperator = numeOperator;
        this.comenzi = new ArrayList<IComanda>();
    }

    public void adaugaComanda(IComanda comanda){
        this.comenzi.add(comanda);
    }

    public void executa(){
        if(this.comenzi.size() > 0){
            this.comenzi.get(0).executaComanda();
            this.comenzi.remove(0);
        }
    }
}

