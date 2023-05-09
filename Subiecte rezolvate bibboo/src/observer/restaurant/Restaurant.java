package observer.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<IClient>listaClienti;

    public Restaurant(String nume) {
        super();
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void addObserver(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void removeObserver(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notifyAll(String mesaj) {
        for(IClient client: listaClienti){
            client.getMesaj(mesaj);
        }
    }
    public void addOferta(String oferta){
        this.notifyAll("Oferta noua!");
    }
}
