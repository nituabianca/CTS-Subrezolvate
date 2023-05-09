package adapter.sportiv;

public class AplicatieFirma implements IAplicatieFirma{
    @Override
    public void achizitioneazaBilet(Bilet bilet) {
        System.out.println("Bilet cumparat");
    }

    @Override
    public void rezervaBilet(Bilet bilet) {
        System.out.println("Bilet achizitionat");
    }
}
