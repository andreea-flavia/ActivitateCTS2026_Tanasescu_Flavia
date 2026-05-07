package ro.ase.cts.Inventat_Strategy.main;

import ro.ase.cts.Inventat_Strategy.clase.ModSustinere;
import ro.ase.cts.Inventat_Strategy.clase.ProbaOrala;
import ro.ase.cts.Inventat_Strategy.clase.ProbaScrisa;
import ro.ase.cts.Inventat_Strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        //Cerinta Inventata: sustinere examen de catre student ai decizia sa fie luata cand studentul intra in sala

        Student student = new Student("Gigel");
        student.examinare();
        student.setModSustinere(new ProbaOrala());
        student.examinare();
        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
