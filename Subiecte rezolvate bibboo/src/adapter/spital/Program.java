package adapter.spital;

public class Program {
    public static void main(String[] args) {
        Medicament medicament=new Medicament("NOSPA", 23,false);

        IAplicatieFarmacie aplicatieFarmacie=new AdapterSpital();
        aplicatieFarmacie.cumparaMedicament(medicament);
    }
}
