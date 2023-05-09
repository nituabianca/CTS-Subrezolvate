package decorator.sportiv;

public class Program {
    public static void main(String[] args) {
        IBilet bilet=new Bilet();
        IBilet biletDdecorat=new BiletDecorat(bilet);
        System.out.println(biletDdecorat.getMesaj());
    }
}
