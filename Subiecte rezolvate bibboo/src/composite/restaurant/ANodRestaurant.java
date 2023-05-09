package composite.restaurant;

public abstract class ANodRestaurant {
    public abstract String getDenumire();
    public abstract void getInfo();
    public void adaugaNod(ANodRestaurant elem){throw new UnsupportedOperationException();}
    public void stergeNod(ANodRestaurant elem){throw new UnsupportedOperationException();}
    public ANodRestaurant getNod(int i){throw new UnsupportedOperationException();}
}
