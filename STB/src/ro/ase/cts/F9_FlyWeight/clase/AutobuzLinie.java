package ro.ase.cts.F9_FlyWeight.clase;

public class AutobuzLinie {
    private String model;
    private String primaStatie;
    private String ultimaStatie;

    public AutobuzLinie(String model, String primaStatie, String ultimaStatie) {
        this.model = model;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getModel() {
        return model;
    }
}
