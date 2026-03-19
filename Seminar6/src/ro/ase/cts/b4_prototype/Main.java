package ro.ase.cts.b4_prototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Tanasescu Flavia", 4, 16, "0707070909");

        Rezervare rezervare2 = (Rezervare) rezervare.copiaza();
        ((Rezervare)rezervare2).setNrPersoane(6);
        ((Rezervare)rezervare2).setOraRezervare(19);
        //e intalnire de afaceri, nu sunt arabi
        rezervare.afisareRezervare();
        rezervare2.afisareRezervare();
    }
}
