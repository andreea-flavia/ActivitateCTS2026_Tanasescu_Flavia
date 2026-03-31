package ro.ase.cts.B0singleton;

//Sistemul de gestiune al restaurantului trebuie să asigure existența unei singure instanțe a
//obiectului care gestionează Casa de Marcat. Toate comenzile de la toate mesele trebuie să fie
//procesate de acest obiect unic pentru a evita erorile de calcul al încasărilor totale și pentru
//a asigura o sincronizare corectă a numerelor de factură emise.


public class CasaDeMarcat {
    private String cod;
    private int sumaExistenta;
    private int limitaMaxima;
    private String valuta;

    public CasaDeMarcat(String cod, int limitaMaxima, String valuta) {
        this.cod = cod;
        this.sumaExistenta = 0;
        this.limitaMaxima = limitaMaxima;
        this.valuta = valuta;
    }

    public void plateste(int suma){
        if(sumaExistenta + suma > limitaMaxima){
            sumaExistenta += suma;
            System.out.println(cod+ " Suma existenta: " + sumaExistenta + " Eroare la efectuarea platii: Limita maxima a fost depasita cu " + (sumaExistenta - limitaMaxima) + " " + valuta);
        }
        else {
            sumaExistenta += suma;
            System.out.println(cod + " Plata a fost efectuata! Suma existenta: " + sumaExistenta);
        }
    }

    private static CasaDeMarcat instanta = null;


    public static CasaDeMarcat getInstanta(String cod, int limitaMaxima, String valuta) {
        if(instanta == null) {
            instanta = new CasaDeMarcat(cod, limitaMaxima, valuta);
        }
        return instanta;
    }

}
