package proxy.spital;

public class SpitalProxy implements ISpital {
    private Spital spital;

    public SpitalProxy(Spital spital) {
        super();
        this.spital = spital;
    }

    @Override
    public void internarePacient(Pacient pacient) {
        if(pacient.isAreAsigurare()==true){
            spital.internarePacient(pacient);
        }
        else {
            System.out.println("Pacientul nu va fi internat deoarece nu are asigurare");
        }
    }
}
