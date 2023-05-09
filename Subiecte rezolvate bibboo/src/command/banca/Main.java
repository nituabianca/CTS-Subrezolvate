package command.banca;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar=new ContBancar();
        ICommand c1=new Depunere();
        ICommand c2=new Constituire();
        ICommand c3=new Retragere();

        Operator operator=new Operator();
        operator.preiaComanda(c1);
        operator.preiaComanda(c2);
        operator.preiaComanda(c3);
        operator.transmiteComanda();
    }
}
