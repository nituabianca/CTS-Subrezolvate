package template.spital;

public abstract class AInternare {
    abstract void analizaDificultateStarePacient();
    abstract void verificareDisponibilitateSaloane();
    abstract void emitereFisaInternare();
    public final void internare(){
        analizaDificultateStarePacient();
        verificareDisponibilitateSaloane();
        emitereFisaInternare();
    }
}
