package adapter.spital;

public class Medicament {
    private String denumire;
    private float pret;
    private boolean estePeReteta;

    public Medicament(String denumire, float pret, boolean estePeReteta) {
        this.denumire = denumire;
        this.pret = pret;
        this.estePeReteta = estePeReteta;
    }

    public boolean isEstePeReteta() {
        return estePeReteta;
    }

    public void setEstePeReteta(boolean estePeReteta) {
        this.estePeReteta = estePeReteta;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
