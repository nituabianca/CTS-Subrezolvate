package decorator.sportiv;

public abstract class ADecorator extends IBilet{
    private IBilet bilet;

    public ADecorator(IBilet bilet) {
        super();
        this.bilet = bilet;
    }
    @Override
    boolean isEchipaLocala() {
        return bilet.isEchipaLocala();
    }

    @Override
    String getMesaj() {
        return bilet.getMesaj();
    }
}
