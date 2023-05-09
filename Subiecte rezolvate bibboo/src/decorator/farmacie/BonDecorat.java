package decorator.farmacie;

public class BonDecorat extends ADecorator{
    public BonDecorat(IBon bon) {
        super(bon);
    }
    @Override
    public String getMesaj() {
        return super.getMesaj();
    }

    @Override
    public String printare() {
        return super.getMesaj()+"LMA";
    }
}
