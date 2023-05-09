package command.restaurant;

public class RezervareMasa implements ICommand{
    @Override
    public void executaComanda() {
        System.out.println("Masa rezervata");
    }
}
