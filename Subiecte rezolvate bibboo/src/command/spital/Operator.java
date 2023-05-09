package command.spital;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    public List<ICommand> listaPacienti;

    public Operator() {
        this.listaPacienti = new ArrayList<>();
    }
    public void preiaPacientul(ICommand command){
        listaPacienti.add(command);
    }
    public void trimitePacient(){
        for(ICommand c:listaPacienti){
            c.executaComanda();
        }
        listaPacienti.clear();
    }
}
