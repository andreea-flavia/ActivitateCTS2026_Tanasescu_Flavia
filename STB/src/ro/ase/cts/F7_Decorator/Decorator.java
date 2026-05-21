package ro.ase.cts.F7_Decorator;

public abstract class Decorator implements IBilet{
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }

    public abstract void printeazaMesaj();
}
