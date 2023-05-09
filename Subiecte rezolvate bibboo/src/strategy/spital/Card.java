package strategy.spital;

public class Card implements IModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("Clientul a platit cu cardul");
    }
}
