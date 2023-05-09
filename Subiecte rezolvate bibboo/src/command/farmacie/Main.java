package command.farmacie;

public class Main {
    public static void main(String[] args) {
        AjutorDeFarmacist ajutorDeFarmacist=new AjutorDeFarmacist();
        ICommand c1=new AduMedicament();
        Farmacist farmacist=new Farmacist();
        farmacist.preiaReteta(c1);
        farmacist.transmiteCOmanda();
    }
}
