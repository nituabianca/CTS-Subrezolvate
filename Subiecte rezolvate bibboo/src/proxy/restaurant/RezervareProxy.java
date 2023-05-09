package proxy.restaurant;

public class RezervareProxy implements IRezervare{
    private Rezervare rezervare;

    public RezervareProxy(Rezervare rezervare) {
        super();
        this.rezervare = rezervare;
    }

    @Override
    public void rezeva(Client client) {
        if(client.getNrPersoane()>=4){
            System.out.println("Rezervare facuta");
            rezervare.rezeva(client);
        }
        else
            if(client.getNrPersoane()>0 &&client.getNrPersoane()<=2){
                System.out.println("Va puteti prezenta la restaurant deoarece sunt disponibile mese de 2 persoane");
            }
            else
                System.out.println("Mese indisponibile");

    }
}
