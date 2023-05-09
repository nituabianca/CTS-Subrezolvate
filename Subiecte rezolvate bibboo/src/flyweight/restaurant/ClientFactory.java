package flyweight.restaurant;

import java.util.HashMap;

public class ClientFactory {
    private HashMap<String, IClient>listaClienti;

    public ClientFactory() {
        super();
        this.listaClienti = new HashMap<>();
    }
    public IClient getClient(String nume){
        IClient client=listaClienti.get(nume);
        if(client==null){
            client=new Client(nume,"0000");
            listaClienti.put(nume,client);
        }
        return client;
    }
}
