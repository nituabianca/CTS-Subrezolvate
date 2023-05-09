package flyweight.farmacie;

public class Reteta {
    private int nrReteta;
    private int sumaPLata;
    private int nrMedicamente;

    public Reteta(int nrReteta, int sumaPLata, int nrMedicamente) {
        super();
        this.nrReteta = nrReteta;
        this.sumaPLata = sumaPLata;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public int getSumaPLata() {
        return sumaPLata;
    }

    public void setSumaPLata(int sumaPLata) {
        this.sumaPLata = sumaPLata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }
}
