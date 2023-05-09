package composite.banca;

public abstract class ANodBanca {
    public abstract String getDenumire();
    public abstract void getInfo();

    public void adaugaNod(ANodBanca nod){throw new UnsupportedOperationException();}
    public void stergeNod(ANodBanca nodBanca){throw new UnsupportedOperationException();}
    public ANodBanca getNod(int i){throw new UnsupportedOperationException();}

}
