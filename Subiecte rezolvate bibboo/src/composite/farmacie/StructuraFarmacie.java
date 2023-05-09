package composite.farmacie;

import java.util.ArrayList;

public class StructuraFarmacie extends ANodFarmacie{
    ArrayList<ANodFarmacie>structura=new ArrayList<>();
    private String denumire;

    public StructuraFarmacie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public void getInfo() {
        System.out.println(denumire);
        for(ANodFarmacie nod:structura) {
            nod.getInfo();
        }
    }
    @Override
    public void adaugaNod(ANodFarmacie nod){
        structura.add(nod);
    }
    @Override
    public void stergeNod(ANodFarmacie nod){
        structura.remove(nod);
    }
    @Override
    public ANodFarmacie getNod(int i){
        return structura.get(i);
    }
}
