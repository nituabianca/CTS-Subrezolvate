package proxy.banca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>listaMonede=new ArrayList<>();
        listaMonede.add("EURo");
        listaMonede.add("LIRA");
        Moneda ron=new Moneda("RON");
        Moneda eur=new Moneda("EUR");
        Cont cont=new Cont(listaMonede);
        cont.creeaza(ron);
        cont.creeaza(eur);
        ContProxy proxy=new ContProxy(cont);
        proxy.creeaza(ron);
        proxy.creeaza(eur);

    }
}
