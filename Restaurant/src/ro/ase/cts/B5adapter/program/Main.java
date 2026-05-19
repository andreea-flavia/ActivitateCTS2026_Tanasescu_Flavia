package ro.ase.cts.B5adapter.program;

import ro.ase.cts.B5adapter.clase.bar_nou.SoftFacturiAdapter;
import ro.ase.cts.B5adapter.clase.bucatarie_vechi.SoftFacturi;

public class Main {
    private static void getFactura(SoftFacturi softFactura){
        softFactura.printeazaFactura();
    }

    public static void main(String[] args) {
        SoftFacturi softFacturi_bucatarie = new SoftFacturi("BucatarieFACTURI");
        ro.ase.cts.B5adapter.clase.bar_nou.SoftFacturi softFacturi_bar = new ro.ase.cts.B5adapter.clase.bar_nou.SoftFacturi("BarFACTURI",13);

        softFacturi_bucatarie.printeazaFactura();
        softFacturi_bar.genereazaFactura();
        System.out.println(" ");

        getFactura( softFacturi_bucatarie );
//        getFactura( softFacturi_bar );
        SoftFacturiAdapter adapter = new SoftFacturiAdapter(softFacturi_bar);
        getFactura( adapter );
    }
}
