package strategy.farmacie;

public class Client {
    private IStrategy modPlata;

    public Client() {
        super();
    }
    public void setModPlata(IStrategy modPlata) {
        this.modPlata = modPlata;
    }
    public void achitaNota(){
        modPlata.plateste();
    }
}
