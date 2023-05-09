package composite.spital;

import java.util.ArrayList;

public class Structura extends ANod {
    ArrayList<ANod>structura=new ArrayList<>();
    private String denumire;

    public Structura(String denumire) {
        this.denumire = denumire;
    }
    @Override
    public String getDenumire() {
        String denumire="";
        denumire+=this.denumire+"\n";
        for(ANod n:structura){
            denumire+=" "+n.getDenumire();
            denumire+="\n";
        }
        return denumire;
    }
    @Override
    public void adaugaNod(ANod elemStruct){
        structura.add(elemStruct);
    }
    @Override
    public void stergeNod(ANod elemStruct){
        structura.remove(elemStruct);
    }
    @Override
    public ANod getNod(int i){
        return structura.get(i);
    }
}
