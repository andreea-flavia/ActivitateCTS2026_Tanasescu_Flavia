package ro.ase.cts.B5adapter.clase.bucatarie_vechi;

public class SoftFacturi {
    private String numeSoft;

    public SoftFacturi(String numeSoft) {
        this.numeSoft = numeSoft;
    }

    public void printeazaFactura(){
        System.out.println(this.numeSoft+": Factura a fost printata");
    }
}
