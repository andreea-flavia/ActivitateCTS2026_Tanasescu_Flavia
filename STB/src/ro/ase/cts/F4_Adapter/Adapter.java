package ro.ase.cts.F4_Adapter;

public class Adapter extends SoftBileteAutobuz{
    private SoftBileteMetrou softNou;

    public Adapter(SoftBileteMetrou softNou) {
        super(softNou.getPret());
        this.softNou = softNou;
    }

    @Override
    public void valideazaBilet() {
        this.softNou.folosesteBilet();
    }
}
