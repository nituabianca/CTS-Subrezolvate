package strategy.restaurant;

public class Cash implements IStrategy{
    @Override
    public void plateste(float suma) {
        System.out.println("Cash");
    }
}
