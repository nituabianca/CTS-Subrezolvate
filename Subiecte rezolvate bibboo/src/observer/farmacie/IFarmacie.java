package observer.farmacie;

public interface IFarmacie {
    void addObservator(IAbonat abonat);
    void removeObservator(IAbonat abonat);
    void notifyAll(String mesaj);
}
