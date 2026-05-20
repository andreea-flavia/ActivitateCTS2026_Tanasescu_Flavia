package ro.ase.cts.B16chainOfResp.clase;

public abstract class NotificareHandler {
    NotificareHandler urmNotif = null;

    public void setUrmNotif(NotificareHandler urmNotif) {
        this.urmNotif = urmNotif;
    }

    public abstract void trimiteNotificare(Client client, String mesaj);
}
