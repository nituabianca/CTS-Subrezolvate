package memento.exempluSintezaCTSOana2;

import memento.exempluSintezaCTSOana.VersiunePachetTuristic;

public class PachetTuristic2 {
    private int nume;
    private String oferta;

    public PachetTuristic2(int nume, String oferta) {
        this.nume = nume;
        this.oferta = oferta;
    }

    @Override
    public String toString() {
        return "PachetTuristic2{" +
                "nume=" + nume +
                ", oferta='" + oferta + '\'' +
                '}';
    }

    public void adaugaOferte(String oferta){
        this.oferta+=", "+oferta;
    }
    public void getVersiune(VersiunePachetTuristic2 versiunePachetTuristic){
        this.oferta=versiunePachetTuristic.getOferta();
    }
    public VersiunePachetTuristic2 saveVersiune(){
        return new VersiunePachetTuristic2(oferta);
    }
}
