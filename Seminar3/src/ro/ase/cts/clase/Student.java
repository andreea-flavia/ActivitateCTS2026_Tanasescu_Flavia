package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;
    private static int sumaFinantare = 10;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }


    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

//    @Override
//    public String toString() {

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "facultate='" + facultate + '\'' +
                ", anStudii=" + anStudii +
                '}';
    }

    ////    return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii;
//
//    }



    public static int getSumaFinantare() {
        return sumaFinantare;
    }

    public static void setSumaFinantare(int sumaFinantare) {
        Student.sumaFinantare = sumaFinantare;
    }

    public void afisareFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Student.sumaFinantare + " Euro/zi in proiect.");
    }

}
