package strategy.spital;

public class Client {
    private String nume;
    private IModPlata modPlata;

    public Client(String nume) {
        super();
        this.nume = nume;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void achitaNota(float suma){
        modPlata.plateste(suma);
    }
}
