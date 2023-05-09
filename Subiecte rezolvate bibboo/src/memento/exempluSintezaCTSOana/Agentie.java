package memento.exempluSintezaCTSOana;

import java.util.ArrayList;
import java.util.List;

public class Agentie {
    private ArrayList<VersiunePachetTuristic>listaPacheteTuristice=new ArrayList<>();

    public void adaugaPachetTuristic(VersiunePachetTuristic versiunePachetTuristic){
        this.listaPacheteTuristice.add(versiunePachetTuristic);
    }
    public VersiunePachetTuristic getPachetTuristic(int i){
        return listaPacheteTuristice.get(i);
    }


}
