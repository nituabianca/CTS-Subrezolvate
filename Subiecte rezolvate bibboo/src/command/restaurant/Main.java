package command.restaurant;

public class Main {
    public static void main(String[] args) {
        Masa masa=new Masa(23);
        Masa masa1=new Masa(24);
        ICommand c1=new OcupareMasa();
        ICommand c2=new RezervareMasa();
        Operator operator=new Operator();
        operator.preiaComanda(c1);
        operator.preiaComanda(c2);;
        operator.transmiteComanda();

    }
}
