package memento.exempluSintezaCTSOana2;

public class Main {
    public static void main(String[] args) {
        Agentie2 agentie2=new Agentie2();
        PachetTuristic2 pachetTuristic2=new PachetTuristic2(67,"oferta");
        pachetTuristic2.adaugaOferte("of 2");
        agentie2.adaugaVersiune(pachetTuristic2.saveVersiune());
        System.out.println(pachetTuristic2);
    }
}
