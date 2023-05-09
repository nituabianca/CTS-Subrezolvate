package observer.banca;

public interface IBanca {
    void addObservator(IAbonat abonat);
    void removeObservator(IAbonat abonat);
    void notifyAll(String mesaj);
}
