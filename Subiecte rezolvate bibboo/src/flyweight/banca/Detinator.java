package flyweight.banca;

public class Detinator implements IDetinator {
    private String numeDetinator;
    private String nrTelefon;
    private String mail;
    private String numeBanca;
    private int capital;

    public Detinator(String numeDetinator, String nrTelefon, String mail, String numeBanca, int capital) {
        super();
        this.numeDetinator = numeDetinator;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
        this.numeBanca = numeBanca;
        this.capital = capital;
    }

    public String getNumeDetinator() {
        return numeDetinator;
    }

    public void setNumeDetinator(String numeDetinator) {
        this.numeDetinator = numeDetinator;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumeBanca() {
        return numeBanca;
    }

    public void setNumeBanca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public void creeazaCont(Cont cont) {
        System.out.println("Contul cu nr "+cont.getNrCont()+" a fost creeat");
    }
}
