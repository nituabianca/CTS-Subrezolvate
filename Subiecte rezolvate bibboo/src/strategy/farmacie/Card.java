package strategy.farmacie;

public class Card implements IStrategy{
    @Override
    public void plateste() {
        System.out.println("Card");
    }
}
