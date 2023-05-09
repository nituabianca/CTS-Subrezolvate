package adapter.banca;

public class Program {
    public static void main(String[] args) {
        Credit credit=new Credit("nume",13321);
        IAplicatieCredite aplicatieCredite=new AdapterBanca();
        aplicatieCredite.obtineCredit(credit);
    }
}
