package flyweight.spital;

public class Pacient implements IPacient{
    private String nume;
    private String nrTelefon;

    public Pacient(String nume, String nrTelefon) {
        super();
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
    public void interneaza(Internare internare) {
        System.out.println("Pacientul a fost internat in salonul "+internare.getNrSalon());
    }
}
