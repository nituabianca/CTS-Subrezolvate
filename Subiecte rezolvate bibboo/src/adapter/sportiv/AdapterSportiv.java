package adapter.sportiv;

public class AdapterSportiv extends AplicatieFirma implements IBiletro{

    @Override
    public void cumparaBilet(Bilet bilet) {
        achizitioneazaBilet(bilet);
    }
}
