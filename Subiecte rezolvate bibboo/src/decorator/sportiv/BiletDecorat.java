package decorator.sportiv;

public class BiletDecorat extends ADecorator{
    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }
    @Override
    boolean isEchipaLocala() {
        return super.isEchipaLocala();
    }

    @Override
    String getMesaj() {
            return super.getMesaj()+"Echipa locala";
    }
}
