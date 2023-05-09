package proxy.sportiv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>listaClienti=new ArrayList<>();
        listaClienti.add("cl1");
        Client cl2=new Client("cl2",14);
        Client cl3=new Client("cl3",15);
        Client cl4=new Client("cl4",10);
        Bilet bilet=new Bilet(listaClienti);
        bilet.cumparaBilet(cl2);
        bilet.cumparaBilet(cl3);
        bilet.cumparaBilet(cl4);
        BiletProxy proxy=new BiletProxy(bilet);
        proxy.cumparaBilet(cl2);
        proxy.cumparaBilet(cl3);
        proxy.cumparaBilet(cl4);
    }
}
