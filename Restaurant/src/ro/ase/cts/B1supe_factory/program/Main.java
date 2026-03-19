package ro.ase.cts.B1supe_factory.program;

import ro.ase.cts.B1supe_factory.factory.SupaFactory;
import ro.ase.cts.B1supe_factory.factory.SupaType;
import ro.ase.cts.B1supe_factory.supe.Supa;

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
