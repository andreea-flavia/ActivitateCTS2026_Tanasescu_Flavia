package ro.ase.cts.B6facade.clase;

public class ReceptieRestaurant {
    private Restaurant restaurant;

    public ReceptieRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void primesteClient(Masa masa){
        if(restaurant.esteMasaLibera(masa.getNrMasa())){
            if(masa.isEsteDebarasata()){
                if(masa.idAreServeteleNoi()){
                    System.out.println("Clientii pot fi asezati la masa #"+masa.getNrMasa());
                    restaurant.ocupaMasa(masa.getNrMasa());
                }
                else {
                    System.out.println("Masa #"+masa.getNrMasa()+" nu are servetele noi!");
                }
            }
            else {
                System.out.println("Masa #"+masa.getNrMasa()+" nu este debarasata!");
            }
        }
        else {
            System.out.println("Masa #"+masa.getNrMasa()+" nu este libera!");
        }
    }
}
