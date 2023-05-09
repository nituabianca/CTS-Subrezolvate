package command.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<ICommand>listaComenzi;

    public Operator() {
        super();
        this.listaComenzi = new ArrayList<>();
    }
    public void preiaComanda(ICommand command){
        listaComenzi.add(command);
    }
    public void transmiteComanda(){
        for (ICommand c:listaComenzi)
            c.executaComanda();
        listaComenzi.clear();
    }
}
