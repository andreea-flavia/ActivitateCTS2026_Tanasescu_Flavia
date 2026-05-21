package ro.ase.cts.F12_ChainOfResp.clase;

public class Troleibuz extends Handler{
    @Override
    public void recomanda(Calator c) {
        if(c.getDistanta() <= 3){
            System.out.println("Foloseste Troleibuz");
        } else{
            this.urmRecomandare.recomanda(c);
        }
    }
}
