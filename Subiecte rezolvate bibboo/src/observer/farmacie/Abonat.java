package observer.farmacie;

public class Abonat implements IAbonat{
    private String nume;

    public Abonat(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("notificat");
    }
}
