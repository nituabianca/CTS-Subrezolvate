package decorator.restaurant;

public abstract class ADecorator implements INotaDePlata{
    private INotaDePlata notaDePlata;

    public ADecorator(INotaDePlata notaDePlata) {
        super();
        this.notaDePlata = notaDePlata;
    }
    @Override
    public String getProdus() {
        return notaDePlata.getProdus();
    }

    @Override
    public float getPret() {
        return notaDePlata.getPret();
    }

    @Override
    public void printareNota() {
        System.out.println("Produs: "+notaDePlata.getProdus()+" pret "+notaDePlata.getPret());
    }

}
