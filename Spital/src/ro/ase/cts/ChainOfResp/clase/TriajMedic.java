package ro.ase.cts.ChainOfResp.clase;

public class TriajMedic extends TriajHandler{
    @Override
    public void trimiteSpreTriaj(Pacient pacient) {
        if(pacient.getGravitateStare()<70) {
            System.out.println("Se ocupa MEDICUL");
        }else
        {
            this.urmTriaj.trimiteSpreTriaj(pacient);
        }
    }
}
