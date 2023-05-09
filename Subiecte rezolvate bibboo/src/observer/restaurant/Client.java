package observer.restaurant;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("A fost notificat");
    }
}
