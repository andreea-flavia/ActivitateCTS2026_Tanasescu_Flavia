package ro.ase.cts.B5adapter.clase.bar_nou;

import ro.ase.cts.B5adapter.clase.bucatarie_vechi.SoftFacturi;

public class SoftFacturiAdapter extends SoftFacturi {
    ro.ase.cts.B5adapter.clase.bar_nou.SoftFacturi softFacturi;

    public SoftFacturiAdapter(ro.ase.cts.B5adapter.clase.bar_nou.SoftFacturi softFacturi) {
        super(softFacturi.getNumeSoft());
        this.softFacturi = softFacturi;
    }

    @Override
    public void printeazaFactura() {
        this.softFacturi.genereazaFactura();
    }
}
