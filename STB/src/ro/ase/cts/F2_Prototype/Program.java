package ro.ase.cts.F2_Prototype;

public class Program {
    public static void main(String[] args){
        Autobuz a = new Autobuz("Autobuzul magic", 5);
        Autobuz a2 = (Autobuz) a.clonare();

        a2.setNume("Autobuz EXTRA magic");
        a2.setPretBilet(10);

        a.afisareDescriere();
        a2.afisareDescriere();
    }
}
