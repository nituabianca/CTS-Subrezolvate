package flyweight.banca;

public class Main {
    public static void main(String[] args) {
        DetinatorFactory factory=new DetinatorFactory();
        Cont cont1=new Cont(1,23);
        Cont cont2=new Cont(2,23);
        Cont cont3=new Cont(3,23);
        factory.getDetinator("detinator1");
        factory.getDetinator("detinator1").creeazaCont(cont1);
    }
}
