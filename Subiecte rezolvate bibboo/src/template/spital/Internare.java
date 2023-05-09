package template.spital;

public class     Internare extends AInternare{
    @Override
    void analizaDificultateStarePacient() {
        System.out.println("dificultate");
    }

    @Override
    void verificareDisponibilitateSaloane() {
        System.out.println("salon");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("fisa");
    }
}
