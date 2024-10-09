public class Empregado {

    private String nome;
    private int id;
    public static final double SALARIO_BASE = 800.0;

    public Empregado(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double salario() {
        return SALARIO_BASE;
    }

    @Override
    public String toString(){
        return "Funcionário | Nome: " + nome + " | ID: " + id + " | Salário: " + salario();
    }

}
