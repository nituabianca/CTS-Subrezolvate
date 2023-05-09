package command.banca;

public class Depunere implements ICommand{
    @Override
    public void executaComanda() {
        System.out.println("Depunere");
    }
}
