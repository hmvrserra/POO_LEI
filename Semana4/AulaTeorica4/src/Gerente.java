public class Gerente extends Funcionario{

    public Gerente(String nome, int id){
        super(nome, id);
    }

    @Override
    public double salario(){
        return super.salario() * 1.5;
    }
}
