package strategy.restaurant;

public class Client {
    private IStrategy modPlata;

    public void setModPlata(IStrategy modPlata) {
        this.modPlata = modPlata;
    }
    public void platesteNota(float suma){
        modPlata.plateste(suma);
    }
    public Client() {
        super();
    }
}
