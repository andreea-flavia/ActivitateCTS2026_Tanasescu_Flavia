package ro.ase.cts.B4prototype;

import java.util.ArrayList;
import java.util.List;

public class ContClient implements IContClient {
    private String nume;
    private List<String> preferinte;

    public ContClient() {
        this.preferinte = new ArrayList<>();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPreferinte(List<String> preferinte) {
        this.preferinte = preferinte;
    }

    public List<String> getPreferinte() {
        return preferinte;
    }

    @Override
    public void incarcaraDate() {
        System.out.println("Se acceseaza baza de date pentru incarcarea preferintelor...");
        this.preferinte.add("Masa la geam");
        this.preferinte.add("Fara gluten");
        this.nume = "Client existent";
    }

    @Override
    public IContClient copiaza() {
        ContClient clona = new ContClient();
        clona.setNume(this.nume);
        List<String> temp = new ArrayList<>();
        for (String p: this.preferinte) {
            temp.add(p);
        }
        clona.setPreferinte(temp);
        return clona;
    }

    @Override
    public String toString() {
        return "ContClient [nume=" + nume + ", preferinte=" + preferinte + "]";
    }
}
