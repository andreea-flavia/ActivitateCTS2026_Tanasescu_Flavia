package ro.ase.cts.F7_Decorator;

public class DecoratorLMA extends Decorator {
    public DecoratorLMA(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaMesaj() {
        super.printeaza();
        System.out.println("LA MULTI ANI!");
    }
}
