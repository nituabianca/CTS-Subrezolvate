package decorator.banca;

public class Plata extends APlata{
    @Override
    String getModPlata() {
        return "plata card";
    }

    @Override
    String plateste() {
        return "Plata efectuata";
    }
}
