package chain.problema2;

public class Ospatar extends AHandler{
    @Override
    public void proceseazaComanda(Comanda comanda) {
        if(comanda.getGrad()<5){
            System.out.println("Ospatar");
        }
        else
            if(this.getNextHandler()!=null){
                this.getNextHandler().proceseazaComanda(comanda);
            }
    }
}
