package ro.ase.cts.F4_Adapter;

public class Main {
    public static void useBilet(SoftBileteAutobuz soft){
        soft.valideazaBilet();
    }

    public static void main(String[] args) {
        SoftBileteAutobuz softAutobuz = new SoftBileteAutobuz(5);
        SoftBileteMetrou softMetrou = new SoftBileteMetrou(6, 1);
        useBilet(softAutobuz);
        Adapter adapter = new Adapter(softMetrou);
        useBilet(adapter);
    }
}
