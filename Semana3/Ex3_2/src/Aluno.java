import java.util.ArrayList;
public class Aluno {
    int numero;
    String nome;
    int anoMatricula;
    int anoNascimento;

    public Aluno(int numero, String nome, int anoMatricula, int anoNascimento) {
        this.numero = numero;
        this.nome = nome;
        this.anoMatricula = anoMatricula;
        this.anoNascimento = anoNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", anoMatricula=" + anoMatricula +
                ", anoNascimento=" + anoNascimento +
                '}';
    }

}
