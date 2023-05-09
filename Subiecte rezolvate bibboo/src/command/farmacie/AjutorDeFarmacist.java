package command.farmacie;

public class AjutorDeFarmacist {
    public AjutorDeFarmacist() {
    }

    public void aduceMedicamente(ICommand command){
        command.executaComanda();
    }
}
