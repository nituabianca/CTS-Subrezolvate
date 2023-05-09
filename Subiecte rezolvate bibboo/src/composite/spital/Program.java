package composite.spital;

public class Program {
    public static void main(String[] args) {
        Structura spital=new Structura("Spital");

        Structura dep1=new Structura("Dep1");
        spital.adaugaNod(dep1);
        Structura dep2=new Structura("Dep2");
        spital.adaugaNod(dep2);

        Structura subdep1=new Structura("Subdep1");
        dep1.adaugaNod(subdep1);
        Structura subdep2=new Structura("Subdep2");
        dep1.adaugaNod(subdep2);
        Structura subdep3=new Structura("Subdep3");
        dep2.adaugaNod(subdep3);
        Structura subdep4=new Structura("Subdep4");
        dep2.adaugaNod(subdep4);

        NodFrunzaSectie sectie1=new NodFrunzaSectie("S1");
        NodFrunzaSectie sectie2=new NodFrunzaSectie("S2");
        NodFrunzaSectie sectie3=new NodFrunzaSectie("S3");
        NodFrunzaSectie sectie4=new NodFrunzaSectie("S4");
        subdep1.adaugaNod(sectie1);
        subdep2.adaugaNod(sectie2);
        subdep3.adaugaNod(sectie3);
        subdep4.adaugaNod(sectie4);

        System.out.println(spital.getInfo());

    }
}
