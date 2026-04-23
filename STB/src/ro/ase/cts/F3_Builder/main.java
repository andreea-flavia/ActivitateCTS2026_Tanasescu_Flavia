package ro.ase.cts.F3_Builder;

public class main {
    public static void main(String[] args) {
//        AutobuzLinie a0 = new AutobuzLinie();
//        a0.setModAutobuz("Hibrid");
//        a0.afisareDescriere();

        AutobuzLinie a = new Builder().setNumeSofer("Mos Craciun").setOpririCapatLinie(true).build();
        AutobuzLinie a2 = new Builder().build();

        a.afisareDescriere();
        a2.afisareDescriere();
    }
}
