package proxy.restaurant;

public class Client {
    private String nume;
    private int nrPersoane;

    public Client(String nume, int nrPersoane) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }
}
