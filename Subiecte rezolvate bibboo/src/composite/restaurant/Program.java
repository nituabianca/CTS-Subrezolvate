package composite.restaurant;

public class Program {
    public static void main(String[] args) {
        StructuraRestaurant restaurant=new StructuraRestaurant("Restaurant");

        StructuraRestaurant bauturi=new StructuraRestaurant("Bauturi");
        restaurant.adaugaNod(bauturi);
        StructuraRestaurant mancare=new StructuraRestaurant("Mancare");
        restaurant.adaugaNod(mancare);

        bauturi.adaugaNod(new NodFrunzaRestaurant("Cola"));
        bauturi.adaugaNod(new NodFrunzaRestaurant("Cafea"));
        mancare.adaugaNod(new NodFrunzaRestaurant("Paste"));
        mancare.adaugaNod(new NodFrunzaRestaurant("Pizza"));

        restaurant.getInfo();


    }
}
