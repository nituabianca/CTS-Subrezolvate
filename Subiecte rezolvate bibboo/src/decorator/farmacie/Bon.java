package decorator.farmacie;

public class Bon implements IBon{
    private String mesaj;
    @Override
    public String getMesaj() {
        return this.mesaj;
    }

    @Override
    public String printare() {
        return getMesaj();
    }
}
