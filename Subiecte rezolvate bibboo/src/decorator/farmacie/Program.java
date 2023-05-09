package decorator.farmacie;

public class Program {
    public static void main(String[] args) {
        IBon bon=new Bon();
        IBon bonDecorat=new BonDecorat(bon);
        System.out.println( bonDecorat.printare());
    }
}
