package adapter.spital;

public class AplicatieSpital implements IAplicatieSpital {
    @Override
    public boolean prezintaReteta(Medicament medicament) {
        if(medicament.isEstePeReteta()==true) {
            System.out.println("Medicamentul este pe reteta");
            return true;
        }
        else{
            System.out.println("Medicamentul nu este pe reteta");
            return false;
        }
    }

    @Override
    public void achizitioneazaMedicament(Medicament medicament) {
        if(prezintaReteta(medicament)==true){
            System.out.println("Medicamentul este achizitionat");
        }
        else{
            System.out.println("Medicamentul nu poate fi achizitionat");
        }
    }
}
