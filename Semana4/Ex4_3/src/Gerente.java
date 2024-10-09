public class Gerente extends Empregado {
    boolean objVenda;

    public Gerente(String nome, int id, boolean objVenda) {
        super(nome, id);
        this.objVenda = objVenda;
    }

    @Override
    public double salario(){
        if (objVenda)
            return super.salario() + 200.0;
        else
            return super.salario();
    }

    @Override
    public String toString(){
        return "Gerente | Nome: " + getNome() + " | ID: " + getId() + " | Cumpriu Objetivo de Venda: " + objVenda + " | Salário: " + salario();
    }
}
