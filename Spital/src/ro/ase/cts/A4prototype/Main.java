package ro.ase.cts.A4prototype;

public class Main {
    public static void main(String[] args) {
        Reteta prototip = new Reteta();
        prototip.incarcareReteta("Ibuprofen");

        Reteta clona = (Reteta) prototip.copiaza();
        clona.setCantitateSolutie(1, 15.0);

        System.out.println(prototip);
        System.out.println(clona);
    }
}
