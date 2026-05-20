package ro.ase.cts.B16chainOfResp.clase;

public class NotificareMail extends NotificareHandler{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getMail()!=null){
            System.out.println("Mail trimis catre "+ client.getNume() + " (" + client.getMail() + "): " + mesaj);
        } else {
            this.urmNotif.trimiteNotificare(client, mesaj);
        }
    }
}
