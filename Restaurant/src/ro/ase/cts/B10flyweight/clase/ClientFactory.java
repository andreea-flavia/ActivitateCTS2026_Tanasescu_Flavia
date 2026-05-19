package ro.ase.cts.B10flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private Map<String, IClient> client = new HashMap<>();

    public IClient getClient(String nume, String telefon, String mail) {
        if(this.client.containsKey(nume)) {
            return this.client.get(nume);
        }
        IClient clientNou = new Client(nume, telefon, mail);
        this.client.put(nume, clientNou);
        return clientNou;
    }
}
