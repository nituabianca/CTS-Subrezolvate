package decorator.banca;

public class PlataDecorata extends ADecorator{
    public PlataDecorata(APlata plata) {
        super(plata);
    }
    @Override
    String getModPlata() {
        return super.getModPlata()+"Contactless";
    }

    @Override
    String plateste() {
        return super.plateste();
    }
}
