package ro.ase.cts.prototypeB4;

public class Program {
    public static void main(String[] args) {
        IContClient client = new ContClient();
        client.incarcaraDate();

        IContClient copie = null;
        copie = client.copiaza();

        System.out.println(copie.toString());

        ContClient prototip = new ContClient();
        prototip.incarcaraDate();

        ContClient copie2 = (ContClient) prototip.copiaza();
        copie2.setNume("Client nou");
        copie2.getPreferinte().add("Intoleranta la lactoza");

        System.out.println(prototip.toString());
        System.out.println(copie2.toString());

    }
}
