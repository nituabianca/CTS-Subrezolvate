package flyweight.farmacie;

import java.util.HashMap;

public class ClientFactory {
    private HashMap<Integer, IClient>listaClienti;

    public ClientFactory() {
        super();
        this.listaClienti = new HashMap<>();
    }
    public IClient getClient(int nrAsigurare){
        IClient client=listaClienti.get(nrAsigurare);
        if(client==null){
            client=new Client(" ",nrAsigurare);
            listaClienti.put(nrAsigurare,client);
        }
        return client;
    }
}
