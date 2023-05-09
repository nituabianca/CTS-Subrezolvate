package chain.problema2;

public class Main {
    public static void main(String[] args) {
        Bucatar bucatar=new Bucatar();
        Ospatar ospatar=new Ospatar();
        ospatar.setNextHandler(bucatar);
        Comanda comanda=new Comanda(6);
        Comanda comanda1=new Comanda(3);
        ospatar.proceseazaComanda(comanda);
        ospatar.proceseazaComanda(comanda1);
    }
}
