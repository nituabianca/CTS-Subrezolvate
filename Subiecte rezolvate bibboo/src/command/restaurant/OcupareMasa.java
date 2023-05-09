package command.restaurant;

public class OcupareMasa implements ICommand{
    @Override
    public void executaComanda() {
        System.out.println("Masa a fost ocupata");
    }
}
