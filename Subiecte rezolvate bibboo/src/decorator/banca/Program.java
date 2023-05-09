package decorator.banca;

public class Program {
    public static void main(String[] args) {
        APlata plata=new Plata();
        APlata plataDecorata=new PlataDecorata(plata);
        System.out.println(plataDecorata.plateste());
        System.out.println(plataDecorata.getModPlata());
    }
}
