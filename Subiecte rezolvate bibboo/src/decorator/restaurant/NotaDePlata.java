package decorator.restaurant;

public class NotaDePlata implements INotaDePlata {
    private String produs;
    private float pret;

    @Override
    public String getProdus() {
        return produs;
    }

    @Override
    public float getPret() {
        return pret;
    }

    @Override
    public void printareNota() {
        System.out.println("Produs: "+getProdus()+" pret "+getPret());
    }
}
