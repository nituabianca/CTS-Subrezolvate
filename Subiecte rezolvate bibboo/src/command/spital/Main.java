package command.spital;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Medic medic=new Medic("Razvan");
        ICommand c1=new Internare(medic);
        ICommand c2=new TratareImediata(medic);
        Operator operator=new Operator();
        operator.preiaPacientul(c1);
        operator.preiaPacientul(c2);
        operator.trimitePacient();
        
    }
}
