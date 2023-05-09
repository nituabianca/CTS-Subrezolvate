package adapter.restaurant;

public class Factura {
    private String produs;
    private int pret;

    public Factura(String produs, int pret) {
        this.produs = produs;
        this.pret = pret;
    }

    public String getProdus() {
        return produs;
    }

    public void setProdus(String produs) {
        this.produs = produs;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
