package decorator.sportiv;

public class Bilet extends IBilet{
    private String mesaj;
    private boolean echipaLocala;

    @Override
    boolean isEchipaLocala() {
        return this.echipaLocala;
    }

    @Override
    String getMesaj() {
        return this.mesaj;
    }
}
