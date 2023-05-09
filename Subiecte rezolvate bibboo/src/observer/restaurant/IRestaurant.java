package observer.restaurant;

public interface IRestaurant {
    void addObserver(IClient client);
    void removeObserver(IClient client);
    void notifyAll(String mesaj);
}
