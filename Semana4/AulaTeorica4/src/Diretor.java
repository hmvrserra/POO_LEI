public class Diretor extends Funcionario{

    private String departamento;

    public Diretor(String nome, int id, String despartamento){
        super(nome, id);
        this.departamento = despartamento;
    }

    @Override
    public double salario(){
        return super.salario() * 3;
    }
    @Override
    public String toString(){
        return "Nome: " + getNome() + " | ID: " + getId() + " | Salário: " + salario() + " | Departamento: " + departamento;
    }
}
