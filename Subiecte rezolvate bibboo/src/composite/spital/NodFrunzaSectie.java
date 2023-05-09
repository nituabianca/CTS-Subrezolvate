package composite.spital;

public class NodFrunzaSectie extends ANod {
    private String denumire;

    public NodFrunzaSectie(String denumire) {
        this.denumire = denumire;
    }
    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
