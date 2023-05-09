package proxy.farmacie;

public class MedicamentProxy implements IMedicament{
    private Medicament medicament;

    public MedicamentProxy(Medicament medicament) {
        super();
        this.medicament = medicament;
    }

    @Override
    public void cumpara(Client client) {
        if(client.isReteta()==true){
            System.out.println("cumparat");
            medicament.cumpara(client);
        }
        else
            System.out.println("nu poate cumpara");

    }
}
