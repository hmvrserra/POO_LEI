import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> staff= new ArrayList<>();

        staff.add(new Funcionario("João", 1));
        staff.add(new Funcionario("Maria", 2));
        staff.add(new Funcionario("José", 3));
        staff.add(new Gerente("Dra. Ana", 4));

        for (Funcionario f : staff) {
            System.out.println(f);
        }
    }
}