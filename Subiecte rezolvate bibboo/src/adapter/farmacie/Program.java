package adapter.farmacie;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        //nu merge
        IAplicatieNoua aplicatieNoua=new AdapterFarmacie();
        Medicament medicament1=new Medicament(1,"nospa", 30);
        Medicament medicament2=new Medicament(2,"ibusinus", 10);
        Medicament medicament3=new Medicament(3,"nurofen", 5);




        aplicatieNoua.verificaStocPentruMedicament(2,3);
        aplicatieNoua.verificaStocPentruMedicament(1,56);
        aplicatieNoua.verificaStocPentruMedicament(3,7);


    }
}
