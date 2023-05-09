package flyweight.banca;

import java.util.HashMap;

public class DetinatorFactory {
    private HashMap<String, IDetinator>listaDetinatori;

    public DetinatorFactory() {
        super();
        this.listaDetinatori=new HashMap<>();
    }
    public int getNrDetinatori(){
        return listaDetinatori.size();
    }
    public IDetinator getDetinator(String nume){
        IDetinator detinator=listaDetinatori.get(nume);
        if(detinator==null){
            detinator=new Detinator(nume,"00000","mail@mail.com","ING",0);
            listaDetinatori.put(nume,detinator);
        }
        return detinator;
    }
}
