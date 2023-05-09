package strategy.spital;

public class Cash implements IModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("Clientul a platit cash");
    }
}
