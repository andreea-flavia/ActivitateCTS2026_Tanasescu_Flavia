package ro.ase.cts.F5_Facade.clase;

public class UsaAutobuz {
    private String pozitieUsa;

    public UsaAutobuz(String pozitieUsa) {
        this.pozitieUsa = pozitieUsa;
    }

    public void deschideLiber(){
        System.out.println("Usa din "+this.pozitieUsa+" - deschisa pentru calatori");
    };

    public void deschideFortat(){
        System.out.println("Usa din "+this.pozitieUsa+" - deschisa de urgenta");
    };
}
