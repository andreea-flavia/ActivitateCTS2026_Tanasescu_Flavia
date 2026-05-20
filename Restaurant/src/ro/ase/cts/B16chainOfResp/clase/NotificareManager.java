package ro.ase.cts.B16chainOfResp.clase;

public class NotificareManager extends NotificareHandler{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("ALERTA MANAGER: Clientul " + client.getNume() + " nu are date de contact salvate!");
    }
}
