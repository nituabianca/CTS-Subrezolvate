package flyweight.sportiv;

public class Persoana implements IPersoana{
    private float inaltime;
    private float latime;
    private String nume;

    public Persoana(float inaltime, float latime, String nume) {
        super();
        this.inaltime = inaltime;
        this.latime = latime;
        this.nume = nume;
    }
    @Override
    public void asazaInTribuna(LocTribuna locTribuna) {
        System.out.println("in tribuna pe locul "+locTribuna.getPozitie());
    }

    public float getInaltime() {
        return inaltime;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    public float getLatime() {
        return latime;
    }

    public void setLatime(float latime) {
        this.latime = latime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
