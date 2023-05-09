package command.banca;

public class ContBancar {
    public ContBancar() {
    }

    public void executa(ICommand command){
        command.executaComanda();
    }
}
