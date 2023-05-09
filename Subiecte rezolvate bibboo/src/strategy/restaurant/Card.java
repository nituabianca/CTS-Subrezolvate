package strategy.restaurant;

public class Card implements IStrategy{
    @Override
    public void plateste(float suma) {
        System.out.println("Card");
    }
}
