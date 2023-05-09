package chain.problemaZurini;

public class Ospatar extends AHandler{
    @Override
    public void procesareComand(Comanda comanda) {
        if(comanda.getGrad()<5){
            System.out.println("Ospatar");
        }
        else
            if(this.getNextHandler()!=null){
                this.getNextHandler().procesareComand(comanda);
            }
    }
}
