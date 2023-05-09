package memento.exempluSintezaCTSOana2;

import java.util.ArrayList;

public class Agentie2 {
    private ArrayList<VersiunePachetTuristic2>listaVersiuni=new ArrayList<>();
    public void adaugaVersiune(VersiunePachetTuristic2 versiunePachetTuristic2){
        this.listaVersiuni.add(versiunePachetTuristic2);
    }
    public void removeVersiune(VersiunePachetTuristic2 versiunePachetTuristic2){
        this.listaVersiuni.remove(versiunePachetTuristic2);
    }
    public VersiunePachetTuristic2 getVersiune(int i){
        return this.listaVersiuni.get(i);
    }
}
