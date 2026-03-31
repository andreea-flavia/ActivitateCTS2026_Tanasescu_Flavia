package ro.ase.cts.A1builder;

public class Builder implements IBuilder {
    private Internare internare;

    public Builder(){
        internare = new Internare();
    }

    public Builder setNumePacient(String numePacient){
        internare.setNumePacient(numePacient);
        return this;
    }

    public Builder setPatRabatabil(boolean patRabatabil){
        internare.setPatRabatabil(patRabatabil);
        return this;
    }

    public Builder setMicDejunInclus(boolean micDejunInclus){
        internare.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public Builder setPapuciCamera(boolean papuciCamera){
        internare.setPapuciCamera(papuciCamera);
        return this;
    }

    public Builder setHalatInterior(boolean halatInterior){
        internare.setHalatInterior(halatInterior);
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
