package adapter.farmacie;

import java.util.ArrayList;

public class AdapterFarmacie extends AplicatieFarmacie implements IAplicatieNoua{
    Medicament medicament;
    public ArrayList<Medicament>listaMedicamente;

    public AdapterFarmacie() {
        this.listaMedicamente=new ArrayList<>();
    }

    @Override
    public boolean verificaStocPentruMedicament(int idMedicament, int nrMedicamenteDorite) {
        for (int i=1; i<listaMedicamente.size();i++){
            if (listaMedicamente.get(i).getIdMedicament()==idMedicament){
                System.out.println("exista");
                return true;
            }

        }
        return false;
}}


//        if(1==idMedicament && 30>=nrMedicamenteDorite){
//            return true;
//        }
//        else
//            if(medicament.getIdMedicament()!=idMedicament) {
//                System.out.println("Medicamentul nu exista");
//                return false;
//            }
//            else
//                System.out.println("Medicamentul nu este in stoc");
//                return false;

