package adapter.farmacie;

public interface IAplicatieFarmacie {
    void setareMedicament(int idMedicament);
    boolean verificareDisponibilitate(int nrMedicamenteDorite);
}
