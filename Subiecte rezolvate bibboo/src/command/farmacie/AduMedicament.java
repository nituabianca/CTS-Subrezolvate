package command.farmacie;

public class AduMedicament implements ICommand{
    @Override
    public void executaComanda() {
        System.out.println("Ajutorul de farmacist a adus medicamentele");
    }
}
