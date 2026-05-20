package ro.ase.cts.B16chainOfResp.clase;

public class Client {
    private String nume;
    private String telefon;
    private String mail;

    public Client(String nume, String telefon, String mail) {
        this.nume = nume;
        this.telefon = telefon;
        this.mail = mail;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getMail() {
        return mail;
    }
}
