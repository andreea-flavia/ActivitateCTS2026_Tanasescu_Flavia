package ro.ase.cts.B5adapter.clase.bar_nou;

public class SoftFacturi {
    private String numeSoft;
    private int nrTotalFacturi;

    public SoftFacturi(String numeSoft, int nrTotalFactura) {
        this.numeSoft = numeSoft;
        this.nrTotalFacturi = nrTotalFactura;
    }

    public void genereazaFactura(){
        System.out.println(this.numeSoft + ": Factura nr. "+this.nrTotalFacturi+" a fost printata");
    }

    public String getNumeSoft() {
        return numeSoft;
    }
}
