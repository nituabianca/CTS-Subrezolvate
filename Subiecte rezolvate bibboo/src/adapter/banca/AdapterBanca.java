package adapter.banca;

public class AdapterBanca extends AplicatieBanca implements IAplicatieCredite{
    @Override
    public void obtineCredit(Credit credit) {
        oferaCredit(credit);
    }
}
