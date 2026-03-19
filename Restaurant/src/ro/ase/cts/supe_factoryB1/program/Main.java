package ro.ase.cts.supe_factoryB1.program;

import ro.ase.cts.supe_factoryB1.factory.SupaFactory;
import ro.ase.cts.supe_factoryB1.factory.SupaType;
import ro.ase.cts.supe_factoryB1.supe.Supa;

public class Main {
    public static void afisareSupa(Supa supa){
        supa.afisareDescriere();
    }

    public static void main(String[] args) {
        SupaFactory factory = new SupaFactory();

        Supa supa_legume = factory.getSupa("Supa de legume (morcov si ghimbir)", 15.5, 245, true, SupaType.SUPA_LEGUME);

        afisareSupa(supa_legume);
    }
}
