package flyweight.restaurant;

public class Main {
    public static void main(String[] args) {
        ClientFactory factory=new ClientFactory();
        Rezervare rezervare=new Rezervare(1,2,12);
        factory.getClient("razvan").rezervaMasa(rezervare);
    }
}
