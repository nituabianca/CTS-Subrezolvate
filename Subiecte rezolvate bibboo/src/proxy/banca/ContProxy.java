package proxy.banca;

public class ContProxy implements ICont{
    private Cont cont;

    public ContProxy(Cont cont) {
        super();
        this.cont = cont;
    }

    @Override
    public void creeaza(Moneda moneda) {
        if(moneda.getMoneda()=="RON"){
            System.out.println("Cont creeat");
            cont.creeaza(moneda);
        }
        else System.out.println("Nu poate fi creeat contul");
    }
}
