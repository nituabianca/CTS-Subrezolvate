package template.restaurant;

public class OcupareMasa extends AOcupareMasa{
    @Override
    void curataMasa() {
        System.out.println("masa curata");
    }

    @Override
    void asazaServetele() {
        System.out.println("servetele");
    }

    @Override
    void asazaTacamuri() {
        System.out.println("tacamuri");
    }

    @Override
    void invitaPersone() {
        System.out.println("persoane invitate");
    }
}
