package ro.ase.cts.F3_Builder;

public class AutobuzLinie {
    private String modAutobuz;
    private String numeSofer;
    private boolean areOpririCapatLinie;
    private boolean deschideUsiToateStatii;
    private String textEcranDerulator;

    public AutobuzLinie() {
    }

    public AutobuzLinie(String modAutobuz, String numeSofer, boolean areOpririCapatLinie, boolean deschideUsiToateStatii, String textEcranDerulator) {
        this.modAutobuz = modAutobuz;
        this.numeSofer = numeSofer;
        this.areOpririCapatLinie = areOpririCapatLinie;
        this.deschideUsiToateStatii = deschideUsiToateStatii;
        this.textEcranDerulator = textEcranDerulator;
    }

    public void setModAutobuz(String modAutobuz) {
        this.modAutobuz = modAutobuz;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setAreOpririCapatLinie(boolean areOpririCapatLinie) {
        this.areOpririCapatLinie = areOpririCapatLinie;
    }

    public void setDeschideUsiToateStatii(boolean deschideUsiToateStatii) {
        this.deschideUsiToateStatii = deschideUsiToateStatii;
    }

    public void setTextEcranDerulator(String textEcranDerulator) {
        this.textEcranDerulator = textEcranDerulator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modAutobuz='").append(modAutobuz).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", areOpririCapatLinie=").append(areOpririCapatLinie);
        sb.append(", deschideUsiToateStatii=").append(deschideUsiToateStatii);
        sb.append(", textEcranDerulator='").append(textEcranDerulator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void afisareDescriere(){
        System.out.println(toString());
    }

}
