package ro.ase.cts.F16_Command.clase;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaPeLinie(int linie){
        System.out.println("Autobuzul "+ this.model +" a plecat pe linia "+ linie);
    }
}
