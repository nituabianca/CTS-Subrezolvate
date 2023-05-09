package template.restaurant;

public abstract class AOcupareMasa {
    abstract void curataMasa();
    abstract void asazaServetele();
    abstract void asazaTacamuri();
    abstract void invitaPersone();
    public final void ocupaMasa(){
        curataMasa();
        asazaServetele();
        asazaTacamuri();
        invitaPersone();
    }
}
