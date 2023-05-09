package decorator.restaurant;

public class NotaDecorata extends ADecorator{
    public NotaDecorata(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public String getProdus() {
        return super.getProdus();
    }

    @Override
    public float getPret() {
        return super.getPret();
    }

    @Override
    public void printareNota() {
        System.out.println("Produs: "+super.getProdus()+" pret "+super.getPret()+". La multi ani.");
    }
}
