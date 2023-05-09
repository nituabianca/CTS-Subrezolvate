package proxy.farmacie;

import java.util.ArrayList;
import java.util.List;

public class Medicament implements IMedicament{
    private String nume;
    private List<String>listaMedicamente;
    private List<Client>listaMedicamenteVandute;

    public Medicament(String nume, List<String> listaMedicamente) {
        super();
        this.nume = nume;
        this.listaMedicamente = listaMedicamente;
        this.listaMedicamenteVandute=new ArrayList<>();
    }

    @Override
    public void cumpara(Client client) {
        listaMedicamenteVandute.add(client);
    }
}
