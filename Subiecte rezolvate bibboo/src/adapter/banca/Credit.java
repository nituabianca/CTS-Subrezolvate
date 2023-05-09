package adapter.banca;

public class Credit {
    private String nume;
    private int suma;

    public Credit(String nume, int suma) {
        this.nume = nume;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
