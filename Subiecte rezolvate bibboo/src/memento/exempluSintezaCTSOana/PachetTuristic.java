package memento.exempluSintezaCTSOana;

public class PachetTuristic {
    private int pret;
    private String oferta;

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "pret=" + pret +
                ", oferta='" + oferta + '\'' +
                '}';
    }

    public PachetTuristic(int pret, String oferta) {
        this.pret = pret;
        this.oferta = oferta;
    }
    public void adaugaOferta(String ofertaNoua){this.oferta+=", "+ofertaNoua;}

    public void getPachetAnterior(VersiunePachetTuristic versiunePachetTuristic){
        this.oferta=versiunePachetTuristic.getOferta();
    }
    public VersiunePachetTuristic salvarePachetTuristic(){
        return new VersiunePachetTuristic(oferta);
    }
}
