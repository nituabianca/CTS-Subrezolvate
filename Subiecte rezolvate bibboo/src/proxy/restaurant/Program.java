package proxy.restaurant;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String>listaClienti=new ArrayList<>();
        listaClienti.add("cl1");
        listaClienti.add("cl2");
        listaClienti.add("cl3");
        listaClienti.add("cl4");
        Client cl5=new Client("cl5",5);
        Rezervare rezervare=new Rezervare("23.09.2023",listaClienti);
        rezervare.rezeva(cl5);
        RezervareProxy proxy=new RezervareProxy(rezervare);
        proxy.rezeva(cl5);
    }
}
