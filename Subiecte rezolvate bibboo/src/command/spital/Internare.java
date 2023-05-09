package command.spital;

public class Internare implements ICommand{
    private Medic medic;

    public Internare(Medic medic) {
        super();
        this.medic = medic;
    }

    @Override
    public void executaComanda() {
        medic.interneaza();
    }
}
