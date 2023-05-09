package flyweight.farmacie;

public class Main {
    public static void main(String[] args) {
        ClientFactory factory=new ClientFactory();
        Reteta r1=new Reteta(1,34,4);
        factory.getClient(3).cumparaMedicamente(r1);
    }
}
