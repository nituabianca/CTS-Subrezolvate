package chain.problemaZurini;

public class Main {
    public static void main(String[] args) {
        Ospatar ospatar=new Ospatar();
        Bucatar bucatar=new Bucatar();
        Comanda comanda=new Comanda(6);
        ospatar.setNextHandler(bucatar);
        ospatar.procesareComand(comanda);
    }
}

