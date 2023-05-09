package command.farmacie;

import java.util.ArrayList;
import java.util.List;

public class Farmacist {
    private List<ICommand> listaComenzi;

    public Farmacist() {
        super();
        this.listaComenzi=new ArrayList<>();
    }

    public void preiaReteta(ICommand command){
        listaComenzi.add(command);
    }
    public void transmiteCOmanda(){
        for (ICommand command:listaComenzi)
            command.executaComanda();
        listaComenzi.clear();
    }

}
