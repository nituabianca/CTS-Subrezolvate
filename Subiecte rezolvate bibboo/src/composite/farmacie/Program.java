package composite.farmacie;

public class Program {
    public static void main(String[] args) {
        StructuraFarmacie farmacie=new StructuraFarmacie("Farmacie");

        StructuraFarmacie raceala=new StructuraFarmacie("Raceala");
        StructuraFarmacie durere=new StructuraFarmacie("Durere");
        farmacie.adaugaNod(raceala);
        farmacie.adaugaNod(durere);

        raceala.adaugaNod(new Medicament("M1"));
        raceala.adaugaNod(new Medicament("M2"));
        durere.adaugaNod(new Medicament("M3"));
        durere.adaugaNod(new Medicament("M4"));

        farmacie.getInfo();
    }
}
