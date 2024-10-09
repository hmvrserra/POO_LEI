//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.addEmpregado(new Empregado("João", 1));
        empresa.addEmpregado(new Gerente("Maria", 2, true));
        empresa.addEmpregado(new Gerente("Ana", 3, false));
        empresa.addEmpregado(new Diretor("José", 4, 1000));
        empresa.listarEmpregados();
    }
}