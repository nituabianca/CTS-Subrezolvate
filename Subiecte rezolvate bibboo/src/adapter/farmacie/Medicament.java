package adapter.farmacie;

public class Medicament {
    private int idMedicament;
    private String denumireMedicament;
    private int stocMedicament;

    public Medicament(int idMedicament, String denumireMedicament, int stocMedicament) {
        this.idMedicament = idMedicament;
        this.denumireMedicament = denumireMedicament;
        this.stocMedicament = stocMedicament;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public int getStocMedicament() {
        return stocMedicament;
    }

    public void setStocMedicament(int stocMedicament) {
        this.stocMedicament = stocMedicament;
    }
}
