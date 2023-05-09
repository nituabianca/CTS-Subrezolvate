package strategy.farmacie;

public class Cash implements IStrategy{
    @Override
    public void plateste() {
        System.out.println("Cash");
    }
}
