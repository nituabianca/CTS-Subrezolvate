package flyweight.banca;

public class Cont {
    private int nrCont;
    private int suma;

    public Cont(int nrCont, int suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    public int getNrCont() {
        return nrCont;
    }

    public void setNrCont(int nrCont) {
        this.nrCont = nrCont;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
