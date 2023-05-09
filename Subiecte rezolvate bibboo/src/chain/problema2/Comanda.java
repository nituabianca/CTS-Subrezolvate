package chain.problema2;

public class Comanda {
    private int grad;

    public Comanda(int grad) {
        this.grad = grad;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "grad=" + grad +
                '}';
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }
}
