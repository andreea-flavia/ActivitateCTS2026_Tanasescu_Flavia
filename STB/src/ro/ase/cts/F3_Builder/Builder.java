package ro.ase.cts.F3_Builder;

public class Builder implements IBuilder {

    private String modAutobuz;
    private String numeSofer;
    private boolean areOpririCapatLinie;
    private boolean deschideUsiToateStatii;
    private String textEcranDerulator;

    public Builder() {
        this.modAutobuz = null;
        this.numeSofer = null;
        this.areOpririCapatLinie = false;
        this.deschideUsiToateStatii = false;
        this.textEcranDerulator = null;
    }

    public Builder setModAutobuz(String modAutobuz) {
        this.modAutobuz = modAutobuz;
        return this;
    }
    public Builder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }
    public Builder setOpririCapatLinie(boolean areOpririCapatLinie) {
        this.areOpririCapatLinie = areOpririCapatLinie;
        return this;
    }
    public Builder setDeschideUsiToateStatii(boolean deschideUsiToateStatii){
        this.deschideUsiToateStatii = deschideUsiToateStatii;
        return this;
    }
    public Builder setTextEcranDerulator(String textEcranDerulator) {
        this.textEcranDerulator = textEcranDerulator;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(modAutobuz, numeSofer, areOpririCapatLinie, deschideUsiToateStatii, textEcranDerulator);
    }
}
