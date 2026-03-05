package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    protected static int punctajMinim = 80;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static void setPunctajMinim(int punctajMinim) {
        Aplicant.punctajMinim = punctajMinim;
    }

    //folositi pt toate fct acelasi verb
    public void afisareStatut() {
//      if (punctaj > 80) //valoare constanta - valoarea trebuie declarata in baza de date sau in fisier, dar acum o facem atribut
//        if (this.punctaj > Aplicant.punctajMinim) {
//            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
//        }
//        else {
//            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
//        }

        //operator ternar
        //e prea lnga linia
//        System.out.println("Aplicantul " + nume + " " + prenume + (this.punctaj > Aplicant.punctajMinim?" ":" nu ") +"a fost acceptat.");

        //facem cu string builder
        final StringBuilder sb = new StringBuilder("Aplicantul ");
        sb.append(nume).append(" ").append(prenume).append(" ");
        sb.append(this.punctaj > Aplicant.punctajMinim?"":" nu ");
        sb.append("a fost acceptat.");

        System.out.println(sb.toString());

    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nr_proiecte, String[] vect) {
        this.nrProiecte = nr_proiecte;
        this.denumireProiect = vect;
    }

    public void afisareFinantare() {
    }

    @Override
    public String toString() {
        return "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect);
    }
}
