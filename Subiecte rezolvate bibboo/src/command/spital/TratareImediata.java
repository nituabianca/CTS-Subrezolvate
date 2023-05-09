package command.spital;

public class TratareImediata implements ICommand{
    private Medic medic;

    public TratareImediata(Medic medic) {
        super();
        this.medic = medic;
    }

    @Override
    public void executaComanda() {
        medic.trateaza();
    }
}
