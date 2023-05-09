package strategy.spital;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("cl");
        client.setModPlata(new Card());
        client.achitaNota(78);
    }

}
