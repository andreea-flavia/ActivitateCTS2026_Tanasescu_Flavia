package others.cafenea.singleton;

import others.cafenea.prototype.BauturaPresetata;

import java.util.List;

public class ProgramFidelitate {
    private String numeProgram;
    private List<BauturaPresetata> bauturiPresetate;

    private static ProgramFidelitate programFidelitate = null;

    private ProgramFidelitate(String numeProgram, List<BauturaPresetata> bauturiPresetate) {
        this.numeProgram = numeProgram;
        this.bauturiPresetate = bauturiPresetate;
    }

    public static ProgramFidelitate getProgramFidelitate(String numeProgram, List<BauturaPresetata> bauturiPresetate) {
        if(programFidelitate == null){
            programFidelitate =  new ProgramFidelitate(numeProgram, bauturiPresetate);
        }
        return programFidelitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProgramFidelitate{");
        sb.append("numeProgram='").append(numeProgram).append('\'');
        sb.append(", bauturiPresetate=").append(bauturiPresetate);
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaDetalii(){
        System.out.println(toString());
    }
}
