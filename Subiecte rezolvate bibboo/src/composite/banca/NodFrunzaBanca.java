package composite.banca;

public class NodFrunzaBanca extends ANodBanca{
    private String denumire;

    public NodFrunzaBanca(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public void getInfo() {
        System.out.println(denumire);
    }
}
