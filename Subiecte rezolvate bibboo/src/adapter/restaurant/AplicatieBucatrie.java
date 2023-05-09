package adapter.restaurant;

public class AplicatieBucatrie implements IAplicatieBucatarie{
    @Override
    public void printeazaFactura(Factura factura) {
        System.out.println("Nota pentru "+factura.getProdus()+" este de "+factura.getPret()+" lei.");
    }
}
