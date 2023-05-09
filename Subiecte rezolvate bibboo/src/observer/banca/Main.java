package observer.banca;

public class Main {
    public static void main(String[] args) {
        Abonat abonat1=new Abonat("abonat1");
        Abonat abonat2=new Abonat("abonat2");
        Abonat abonat3=new Abonat("abonat3");

        Banca banca=new Banca("banca");

        banca.addObservator(abonat1);
        banca.addObservator(abonat2);
        banca.addObservator(abonat3);
        banca.adaugaNotidicare("notif");
    }
}
