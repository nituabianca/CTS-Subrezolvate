package proxy.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Rezervare implements IRezervare{
    private String data;
    private List<String>listaClienti;
    private List<Client>listaRezervari;

    public Rezervare(String data, List<String> listaClienti) {
        super();
        this.data = data;
        this.listaClienti = listaClienti;
        this.listaRezervari=new ArrayList<>();
    }

    @Override
    public void rezeva(Client client) {
        listaRezervari.add(client);
    }
}
