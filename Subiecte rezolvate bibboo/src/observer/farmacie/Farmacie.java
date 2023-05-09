package observer.farmacie;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie{
    private String nume;
    private List<IAbonat>listaAbonati;

    public Farmacie(String nume) {
        super();
        this.nume = nume;
        this.listaAbonati=new ArrayList<>();
    }

    @Override
    public void addObservator(IAbonat abonat) {
        listaAbonati.add(abonat);
    }

    @Override
    public void removeObservator(IAbonat abonat) {
        listaAbonati.remove(abonat);
    }

    @Override
    public void notifyAll(String mesaj) {
        for (IAbonat abonat:listaAbonati){
            abonat.getMesaj(mesaj);
        }
    }

    public void adaugaNotificare(String mesaj){
        this.notifyAll("Notificare ");
    }

}
