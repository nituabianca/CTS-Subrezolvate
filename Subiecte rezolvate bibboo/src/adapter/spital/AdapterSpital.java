package adapter.spital;

public class AdapterSpital extends AplicatieSpital implements IAplicatieFarmacie {
    @Override
    public void cumparaMedicament(Medicament medicament) {
        System.out.println("Conform regulilor spitalului, trebuie sa prezentati reteta");
        this.achizitioneazaMedicament(medicament);
    }
}
