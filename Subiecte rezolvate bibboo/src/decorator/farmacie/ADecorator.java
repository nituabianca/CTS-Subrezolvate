package decorator.farmacie;

public class ADecorator implements IBon{
    private IBon bon;
    public ADecorator(IBon bon) {
        super();
        this.bon=bon;
    }

    @Override
    public String getMesaj() {
        return bon.getMesaj();
    }

    @Override
    public String printare() {
        return bon.printare();
    }
}
