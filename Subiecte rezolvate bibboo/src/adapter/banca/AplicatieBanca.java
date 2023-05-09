package adapter.banca;

public class AplicatieBanca implements IAplicatieBanca{
    @Override
    public void oferaCredit(Credit credit) {
        System.out.println("Credit obtinut");
    }
}
