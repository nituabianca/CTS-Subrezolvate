package command.spital;

public class Medic {
    private String nume;

    public Medic(String nume) {
        super();
        this.nume = nume;
    }
    public void interneaza(){
        System.out.println("Pacientul a fost internat");
    }
    public void trateaza(){
        System.out.println("Medicul se ocupa cu tratarea pacientului");
    }
}
