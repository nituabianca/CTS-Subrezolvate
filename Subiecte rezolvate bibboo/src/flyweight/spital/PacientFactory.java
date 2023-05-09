package flyweight.spital;

import java.util.HashMap;

public class PacientFactory {
    private HashMap<String, IPacient>listaPacienti;

    public PacientFactory() {
        super();
        this.listaPacienti=new HashMap<>();
    }
    public IPacient getPacient(String nume){
        IPacient pacient=listaPacienti.get(nume);
        if(pacient==null){
            pacient=new Pacient(nume,"00000");
            listaPacienti.put(nume, pacient);
        }
        return pacient;
    }
}
