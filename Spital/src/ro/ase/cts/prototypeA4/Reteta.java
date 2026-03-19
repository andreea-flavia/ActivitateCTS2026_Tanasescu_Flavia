package ro.ase.cts.prototypeA4;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta {
    private String denumire;
    private List<Double> cantSolutii;

    public Reteta() {
        this.cantSolutii = new ArrayList<>();
    }

    @Override
    public void incarcareReteta(String nume) {
        System.out.println("Se calculeaza dozajele chimice pentru " + nume + "...");
        this.denumire = nume;
        this.cantSolutii.add(10.5);
        this.cantSolutii.add(2.3);
        this.cantSolutii.add(0.05);
    }

    @Override
    public IReteta copiaza() {
        Reteta clona = new Reteta();
        clona.denumire = this.denumire;

        List<Double> temp = new ArrayList<>();
        for(Double d : this.cantSolutii) {
            temp.add(d);
        }

        clona.cantSolutii = temp;

        return clona;
    }

    public void setCantitateSolutie(int i, double val){
        this.cantSolutii.set(i, val);
    }

    @Override
    public String toString() {
        return "Reteta [Medicament=" + denumire + ", Solutii=" + cantSolutii + "]";
    }
}
