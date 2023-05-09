package composite.spital;

public abstract class ANod {
    public abstract String getDenumire();

    public String getInfo(){
        return this.getDenumire();
    }
    public void adaugaNod(ANod elemStruct){throw new UnsupportedOperationException();}
    public void stergeNod(ANod elemStruct){throw new UnsupportedOperationException();}
    public ANod getNod(int i){throw new UnsupportedOperationException();}
}
