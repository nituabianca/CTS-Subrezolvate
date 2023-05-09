package adapter.sportiv;

public class Program {
    public static void main(String[] args) {
        Bilet bilet=new Bilet("Nume",12);
        IBiletro biletro=new AdapterSportiv();
        biletro.cumparaBilet(bilet);
    }
}
