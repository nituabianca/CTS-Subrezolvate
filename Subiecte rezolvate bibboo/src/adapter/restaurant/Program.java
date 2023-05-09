package adapter.restaurant;

public class Program {
    public static void main(String[] args) {
        Factura factura=new Factura("Bere",10);
        IAplicatieBar aplicatieBar=new AdapterRestaurant();
        aplicatieBar.printeaza(factura);
    }
}
