package proxy.farmacie;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String>listaMedicamente=new ArrayList<>();
        listaMedicamente.add("m1");
        listaMedicamente.add("m3");
        listaMedicamente.add("m2");
        Client cl1=new Client("cl1", true);
        Client cl2=new Client("cl2", false);
        Medicament medicament=new Medicament("m4",listaMedicamente);
        medicament.cumpara(cl1);
        medicament.cumpara(cl2);
        MedicamentProxy proxy=new MedicamentProxy(medicament);
        proxy.cumpara(cl1);
        proxy.cumpara(cl2);
    }
}
