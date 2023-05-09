package observer.restaurant;

public class Main {
    public static void main(String[] args) {
        Client cl1=new Client("cl1");
        Client cl2=new Client("cl2");
        Client cl3=new Client("cl3");

        Restaurant restaurant=new Restaurant("Restaurant");
        restaurant.addObserver(cl1);
        restaurant.addObserver(cl2);
        restaurant.addObserver(cl3);

        restaurant.addOferta("oferta");
    }
}
