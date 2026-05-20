package ro.ase.cts.B16chainOfResp.clase;

public class NotificareSMS extends NotificareHandler{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getTelefon()!= null){
            System.out.println("SMS trimis catre "+ client.getNume() + " (" + client.getTelefon() + "): " + mesaj);
        } else
            this.urmNotif.trimiteNotificare(client, mesaj);
    }
}
