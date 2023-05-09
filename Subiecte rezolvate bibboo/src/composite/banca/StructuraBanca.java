package composite.banca;

import java.util.ArrayList;

public class StructuraBanca extends ANodBanca{
    ArrayList<ANodBanca> structura=new ArrayList<>();
    public String denumire;

    public StructuraBanca(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public void getInfo() {
        System.out.println(denumire);
        for (ANodBanca nod:structura){
            nod.getInfo();
        }
    }
    @Override
    public void adaugaNod(ANodBanca nodBanca){
        structura.add(nodBanca);
    }
    @Override
    public void stergeNod(ANodBanca nodBanca){
        structura.remove(nodBanca);
    }
    @Override
    public ANodBanca getNod(int i){
        return structura.get(i);
    }
}
