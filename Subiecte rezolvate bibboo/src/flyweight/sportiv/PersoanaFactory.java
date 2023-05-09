package flyweight.sportiv;

import java.util.HashMap;

public class PersoanaFactory {
    private HashMap<String, IPersoana> listaPersoane;

    public PersoanaFactory() {
        this.listaPersoane=new HashMap<>();
    }
    public int getNrPersoane(){
        return listaPersoane.size();
    }

    public IPersoana getPersoana(String nume){
        IPersoana persoana=listaPersoane.get(nume);
        if(persoana==null){
            persoana=new Persoana(2,3,nume);
            listaPersoane.put(nume,persoana);
        }
        return persoana;
    }
}
