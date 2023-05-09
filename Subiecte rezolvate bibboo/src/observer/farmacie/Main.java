package observer.farmacie;

public class Main {
    public static void main(String[] args) {
        IAbonat abonat1=new Abonat("Abonat1");
        IAbonat abonat2=new Abonat("Abonat2");
        IAbonat abonat3=new Abonat("Abonat3");

        Farmacie farmacie=new Farmacie("Farmacie");
        farmacie.addObservator(abonat1);
        farmacie.addObservator(abonat2);
        farmacie.addObservator(abonat3);
        farmacie.adaugaNotificare("notif");
    }
}
