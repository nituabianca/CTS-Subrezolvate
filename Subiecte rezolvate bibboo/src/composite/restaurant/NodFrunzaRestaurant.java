package composite.restaurant;

public class NodFrunzaRestaurant extends ANodRestaurant{
    private String denumire;

    public NodFrunzaRestaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public void getInfo() {
        System.out.println(denumire);
    }
}
