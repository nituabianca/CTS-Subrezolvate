package proxy.banca;

import java.util.ArrayList;
import java.util.List;

public class Cont implements ICont{
    private List<String>listaMonede;
    private List<Moneda>listaConturi;

    public Cont(List<String> listaMonede) {
        super();
        this.listaMonede = listaMonede;
        this.listaConturi=new ArrayList<>();
    }

    @Override
    public void creeaza(Moneda moneda) {
        listaConturi.add(moneda);
    }
}
