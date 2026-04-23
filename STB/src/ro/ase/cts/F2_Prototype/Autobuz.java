package ro.ase.cts.F2_Prototype;

public class Autobuz implements IAutobuz {
    String nume;
    int pretBilet;

    public Autobuz() {
    }

    public Autobuz(String nume, int pretBilet) {
        this.nume = nume;
        this.pretBilet = pretBilet;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPretBilet(int pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IAutobuz clonare() {
        Autobuz a = new Autobuz();
        a.setNume(nume);
        a.setPretBilet(pretBilet);
        return a;
    }

    public void afisareDescriere(){
        System.out.println(toString());
    }
}
