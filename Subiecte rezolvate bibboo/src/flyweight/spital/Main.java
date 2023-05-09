package flyweight.spital;

public class Main {
    public static void main(String[] args) {
        PacientFactory factory=new PacientFactory();
        Internare internare=new Internare(1,6);
        Pacient pacient=new Pacient("razvan","8379293");
        factory.getPacient("razvan").interneaza(internare);
    }
}
