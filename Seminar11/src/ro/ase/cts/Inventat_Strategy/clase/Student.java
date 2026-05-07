package ro.ase.cts.Inventat_Strategy.clase;

public class Student {
    private ModSustinere modSustinere;
    String nume;

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.modSustinere = new ProbaGrila();
        this.nume = nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
