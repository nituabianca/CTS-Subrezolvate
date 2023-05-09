package proxy.banca;

public class Moneda {
    private String moneda;

    public Moneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "moneda='" + moneda + '\'' +
                '}';
    }

    public String getMoneda() {
        return moneda;
    }
}
