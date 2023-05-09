package composite.farmacie;

public abstract class ANodFarmacie {
    public abstract String getDenumire();
    public abstract void getInfo();
    public void adaugaNod(ANodFarmacie nod){throw new UnsupportedOperationException();}
    public void stergeNod(ANodFarmacie nod){throw new UnsupportedOperationException();}
    public ANodFarmacie getNod(int i){throw new UnsupportedOperationException();}
}
