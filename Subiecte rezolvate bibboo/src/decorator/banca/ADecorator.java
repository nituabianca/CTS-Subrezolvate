package decorator.banca;

public abstract class ADecorator extends APlata{
    private APlata plata;

    public ADecorator(APlata plata) {
        super();
        this.plata = plata;
    }
    @Override
    String getModPlata() {
        return plata.getModPlata();
    }

    @Override
    String plateste() {
        return plata.plateste();
    }
}
