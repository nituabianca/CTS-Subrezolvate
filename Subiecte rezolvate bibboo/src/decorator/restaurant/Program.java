package decorator.restaurant;

public class Program {
    public static void main(String[] args) {
        INotaDePlata notaDePlata=new NotaDePlata();
        INotaDePlata notaDecorata=new NotaDecorata(notaDePlata);
        notaDecorata.printareNota();
    }
}
