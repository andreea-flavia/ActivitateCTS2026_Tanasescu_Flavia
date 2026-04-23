package ro.ase.cts.F1_Simple_Factory_Prototype.clase;

public abstract class MijlocTransport {
    double pretBilet;
    String numeMijloc;

    public MijlocTransport(double pretBilet, String numeMijloc) {
        this.pretBilet = pretBilet;
        this.numeMijloc = numeMijloc;
    }

    public MijlocTransport() {
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }

    public void setNumeMijloc(String numeMijloc) {
        this.numeMijloc = numeMijloc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("pretBilet=").append(pretBilet);
        sb.append(", numeMijloc='").append(numeMijloc).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void afisareDescriere(){}

//    PROTOTYPE
    public abstract MijlocTransport clonare();
}
