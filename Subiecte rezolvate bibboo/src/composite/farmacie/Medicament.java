package composite.farmacie;

public class Medicament extends ANodFarmacie{
    private String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public void getInfo() {
        System.out.println(denumire);
    }
}
