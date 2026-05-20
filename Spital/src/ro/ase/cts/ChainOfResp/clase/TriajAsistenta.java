package ro.ase.cts.ChainOfResp.clase;

public class TriajAsistenta extends TriajHandler{
    @Override
    public void trimiteSpreTriaj(Pacient pacient) {
        if(pacient.getGravitateStare()<30) {
            System.out.println("Se ocupa ASISTENTA");
        } else
        {
            this.urmTriaj.trimiteSpreTriaj(pacient);
        }
    }
}
