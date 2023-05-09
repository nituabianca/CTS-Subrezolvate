package proxy.sportiv;

import java.util.ArrayList;
import java.util.List;

public class Bilet implements IBilet{
    private List<String>listaClienti;
    private List<Client>listaParticipanti;

    public Bilet(List<String> listaClienti) {
        super();
        this.listaClienti = listaClienti;
        this.listaParticipanti=new ArrayList<>();
    }

    @Override
    public void cumparaBilet(Client client) {
        listaParticipanti.add(client);
    }
}
