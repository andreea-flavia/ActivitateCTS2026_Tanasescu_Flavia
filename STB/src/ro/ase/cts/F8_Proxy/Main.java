package ro.ase.cts.F8_Proxy;

import ro.ase.cts.F8_Proxy.clase.Autobuz;
import ro.ase.cts.F8_Proxy.clase.IAutobuz;
import ro.ase.cts.F8_Proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz(5, 10);
        Autobuz a2 = new Autobuz(5, 0);
        a1.opresteInStatie();
        a2.opresteInStatie();
        System.out.println("_____________________");
        Proxy proxy = new Proxy(a2);
        proxy.opresteInStatie();
    }
}
