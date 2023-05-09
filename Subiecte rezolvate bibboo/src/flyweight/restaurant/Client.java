package flyweight.restaurant;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;

    public Client(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void rezervaMasa(Rezervare rezervare) {
        System.out.println("Masa cu nr "+rezervare.getNrMasa()+" a fost rezervata");
    }
}
