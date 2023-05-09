package proxy.sportiv;

public class BiletProxy implements IBilet{
    private Bilet bilet;

    public BiletProxy(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void cumparaBilet(Client client) {
        if(client.getVarsta()>=14){
            System.out.println("Bilet cumparat");
            bilet.cumparaBilet(client);
        }
        else{
            System.out.println("min 14 ani!");
        }
    }
}
