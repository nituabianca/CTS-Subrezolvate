package flyweight.farmacie;

public class Client implements IClient{
    private String nume;
    private int nrAsigurare;

    public Client(String nume, int nrAsigurare) {
        super();
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAsigurare() {
        return nrAsigurare;
    }

    public void setNrAsigurare(int nrAsigurare) {
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void cumparaMedicamente(Reteta reteta) {
        System.out.println("Clientul a cumparat medicamentele de pe reteta cu nr "+reteta.getNrReteta());
    }
}
