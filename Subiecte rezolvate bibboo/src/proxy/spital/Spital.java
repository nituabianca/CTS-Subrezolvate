package proxy.spital;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String denumire;
    List<String> listaPacienti;
    List<Pacient> listaPacientiInternati;

    public Spital(String denumire, List<String> listaPacienti) {
        this.denumire = denumire;
        this.listaPacienti = listaPacienti;
        listaPacientiInternati=new ArrayList<>();
    }
    @Override
    public void internarePacient(Pacient pacient) {
        this.listaPacientiInternati.add(pacient);
        System.out.println("Pacientul "+ pacient.getNume()+" a fost internat");
    }
}
