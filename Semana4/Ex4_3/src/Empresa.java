import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empregado> empregados;

    public Empresa() {
        empregados = new ArrayList<>();
    }

    public void addEmpregado(Empregado empregado){
        empregados.add(empregado);
    }

    public void removeEmpregado(Empregado empregado){
        empregados.remove(empregado);
    }

    public void listarEmpregados(){
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
        System.out.println();
    }
}
