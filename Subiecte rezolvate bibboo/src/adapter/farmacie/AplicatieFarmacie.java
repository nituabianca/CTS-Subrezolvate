package adapter.farmacie;

import java.util.ArrayList;
import java.util.List;

public class AplicatieFarmacie implements IAplicatieFarmacie{
    Medicament medicament;
    @Override
    public void setareMedicament(int idMedicament) {
        if(idMedicament!=0){
            medicament.setIdMedicament(idMedicament);
        }
        else {
            System.out.println("Medicamentul cautat nu exista");
        }
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamenteDorite) {
        if(medicament.getStocMedicament()>=nrMedicamenteDorite){
            return true;
        }
        else
            return false;
    }
}
