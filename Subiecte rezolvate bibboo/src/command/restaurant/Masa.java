package command.restaurant;

public class Masa {
    private int nrMasa;
    public Masa(int nrMasa) {
        super();
        this.nrMasa = nrMasa;
    }
    public void rezervaMasa(){
        System.out.println("Masa cu nr "+this.nrMasa+" a fost rezervata");
    }
    public void ocupaMasa(){
        System.out.println("Masa cu nr "+this.nrMasa+" a fost ocupata");
    }
}
