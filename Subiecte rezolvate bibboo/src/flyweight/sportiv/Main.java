package flyweight.sportiv;

public class Main {
    public static void main(String[] args) {
        PersoanaFactory factory=new PersoanaFactory();
        LocTribuna locTribuna1=new LocTribuna("34","albastru");
        LocTribuna locTribuna2=new LocTribuna("33","albastru");
        LocTribuna locTribuna3=new LocTribuna("31","albastru");
        Persoana persoana= (Persoana) factory.getPersoana("nume1");
        persoana.asazaInTribuna(locTribuna1);
        factory.getPersoana("nume1").asazaInTribuna(locTribuna2);
        System.out.println(factory.getPersoana("nume1"));
    }
}
