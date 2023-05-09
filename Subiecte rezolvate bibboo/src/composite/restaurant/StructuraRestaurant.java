package composite.restaurant;

import java.util.ArrayList;

public class StructuraRestaurant extends ANodRestaurant {
    ArrayList<ANodRestaurant>structura=new ArrayList<>();
    private String denumire;

    public StructuraRestaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getInfo() {
        System.out.println(denumire);
        for (ANodRestaurant nod:structura){
            nod.getInfo();
        }
    }

    @Override
    public void adaugaNod(ANodRestaurant nod){
        structura.add(nod);
    }
    @Override
    public void stergeNod(ANodRestaurant nodRestaurant){
        structura.remove(nodRestaurant);
    }
    @Override
    public ANodRestaurant getNod(int i){
        return structura.get(i);
    }

}
