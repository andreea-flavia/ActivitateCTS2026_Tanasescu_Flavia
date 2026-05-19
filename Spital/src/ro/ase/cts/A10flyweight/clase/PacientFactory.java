package ro.ase.cts.A10flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    private HashMap<String, IPacient> pacient = new HashMap<>();
    public IPacient getPacient(String nume, String telefon, String adresa) {
        if(pacient.containsKey(nume)) {
            return pacient.get(nume);
        }
        IPacient pacientNou = new Pacient(nume, telefon, adresa);
        pacient.put(nume, pacientNou);
        return pacientNou;
    }
}
