public class Diretor extends Empregado {

    private int lucroMensal;

    public Diretor(String nome, int id, int lucroMensal) {
        super(nome, id);
        this.lucroMensal = lucroMensal;
    }

    @Override
    public double salario(){
        return (super.salario() * 2) + (lucroMensal*0.01);
    }
    @Override
    public String toString(){
        return "Diretor | Nome: " + getNome() + " | ID: " + getId() + " | Lucro Mensal: " + lucroMensal + " | Salário: " + salario() ;
    }
}
