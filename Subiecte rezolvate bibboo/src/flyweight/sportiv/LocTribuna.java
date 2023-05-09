package flyweight.sportiv;

public class LocTribuna {
    private String pozitie;
    private String culoareTricou;

    public LocTribuna(String pozitie, String culoareTricou) {
        super();
        this.pozitie = pozitie;
        this.culoareTricou = culoareTricou;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    public void setCuloareTricou(String culoareTricou) {
        this.culoareTricou = culoareTricou;
    }
}
