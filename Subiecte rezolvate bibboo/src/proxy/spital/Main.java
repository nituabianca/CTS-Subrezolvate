package proxy.spital;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>listaPacienti=new ArrayList<>();
        listaPacienti.add("P1");
        listaPacienti.add("P2");
        listaPacienti.add("P3");
        Pacient p1=new Pacient("P1",true);
        Pacient p2=new Pacient("P2",false);
        Pacient p3=new Pacient("P3",true);
        Spital spital=new Spital("Spital",listaPacienti);
        SpitalProxy proxy=new SpitalProxy(spital);
        proxy.internarePacient(p1);
        proxy.internarePacient(p2);
        proxy.internarePacient(p3);
    }
}
