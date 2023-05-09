package proxy.farmacie;

public class Client {
    private String nume;
    private boolean reteta;
    public Client(String nume, boolean reteta) {
        this.nume = nume;
        this.reteta = reteta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", reteta=" + reteta +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isReteta() {
        return reteta;
    }

    public void setReteta(boolean reteta) {
        this.reteta = reteta;
    }


}
