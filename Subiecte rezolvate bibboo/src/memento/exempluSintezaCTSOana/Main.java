package memento.exempluSintezaCTSOana;

public class Main {
    public static void main(String[] args) {
        Agentie agentie=new Agentie();
        PachetTuristic pachetTuristic=new PachetTuristic(12,"of1");
        pachetTuristic.adaugaOferta("oferta 2");
        agentie.adaugaPachetTuristic(pachetTuristic.salvarePachetTuristic());
        System.out.println(pachetTuristic);
    }
}
