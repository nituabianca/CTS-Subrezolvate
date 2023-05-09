package flyweight.spital;

public class Internare {
    private int nrSalon;
    private int nrPaturi;

    public Internare(int nrSalon, int nrPaturi) {
        this.nrSalon = nrSalon;
        this.nrPaturi = nrPaturi;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrPaturi() {
        return nrPaturi;
    }

    public void setNrPaturi(int nrPaturi) {
        this.nrPaturi = nrPaturi;
    }
}
