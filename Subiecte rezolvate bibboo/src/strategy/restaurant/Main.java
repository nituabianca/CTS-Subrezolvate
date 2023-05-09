package strategy.restaurant;

public class Main {
    public static void main(String[] args) {
        Client client=new Client();
        client.setModPlata(new Card());
        client.platesteNota(78);
        Client client2=new Client();
        client2.setModPlata(new Cash());
        client2.platesteNota(89);
    }
}
