public class Main {
    public static void main(String[] args) {

        //Incializar a empresa
        Empresa empresa = new Empresa();

        //Declarar e adicionar empregados
        Empregado e1 = new Empregado("João", 1);
        Empregado g1 = new Gerente("Maria", 2, true);
        Empregado g2 = new Gerente("Ana", 3, false);
        Empregado d1 = new Diretor("José", 4, 1000);
        empresa.addEmpregado(e1);
        empresa.addEmpregado(g1);
        empresa.addEmpregado(g2);
        empresa.addEmpregado(d1);

        //Listar empregados
        empresa.listarEmpregados();

        //Remover empregado que não cumpriu objetivo de venda
        empresa.removeEmpregado(g2);

        //Listar empregados
        empresa.listarEmpregados();
    }
}