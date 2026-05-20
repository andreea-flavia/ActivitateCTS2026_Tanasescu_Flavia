package ro.ase.cts.B16chainOfResp;

import ro.ase.cts.B16chainOfResp.clase.*;

public class Main {
    public static void main(String[] args) {
        NotificareHandler notifSMS = new NotificareSMS();
        NotificareHandler notifMail = new NotificareMail();
        NotificareHandler notifManager = new NotificareManager();

        notifSMS.setUrmNotif(notifMail);
        notifMail.setUrmNotif(notifManager);

        Client client1 = new Client("Flavi", "1234567890", "flavi@gmail.com");
        Client client2 = new Client("Ducu", null, "duku@gmail.com");
        Client client3 = new Client("Niko", null, null);

        String oferta = "A aparut meniul nou de primavara! Reducere 20%!";

        notifSMS.trimiteNotificare(client1, oferta);
        notifSMS.trimiteNotificare(client2, oferta);
        notifSMS.trimiteNotificare(client3, oferta);
    }
}
