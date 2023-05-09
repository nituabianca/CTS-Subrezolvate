package adapter.restaurant;

public class AdapterRestaurant extends AplicatieBucatrie implements IAplicatieBar{
    @Override
    public void printeaza(Factura factura) {
        this.printeazaFactura(factura);
    }
}
