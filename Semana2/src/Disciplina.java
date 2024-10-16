import javax.print.attribute.standard.MediaSize;
import java.io.File;
import java.io.Writer;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;

public class Disciplina {

    private String nome;
    private String sigla;
    private int capacidade;
    private ArrayList<Inscricao> inscricoes = new ArrayList<>();

    public Disciplina(String nome, String sigla, int capacidade) {
        this.nome = nome;
        this.sigla = sigla;
        this.capacidade = capacidade;
    }

    public void inscrever(Aluno aluno) {

        if (inscricoes.size() < capacidade) {
            Inscricao insc = new Inscricao(aluno);
            inscricoes.add(insc);
        }
        else
            System.err.println("O aluno " + aluno + " já não tem espaço em " + sigla + "...");
    }

    public String getSigla() {
        return sigla;
    }

    public void atualizarNota(Aluno aluno, int nota) {
        for (Inscricao insc: inscricoes) {
            if (insc.getAluno().getNumero() == aluno.getNumero()) {
                insc.setNota(nota);
                return;
            }
        }
        System.err.println("Aluno não encontrado");
    }

    public void escreverFicheiroDeSaida(String nomeFicheiro) {
        try {
            PrintWriter writer = new PrintWriter(new File("Semana2/" + nomeFicheiro + ".txt"));
            writer.println(this.nome + "\n" + this.capacidade);

            for (Inscricao insc: this.inscricoes) {
                int nota = insc.getNota();
                if (nota == -1)
                    writer.println(insc.getAluno().getNumero() + " NA");
                else
                    writer.println(insc.getAluno().getNumero() + " " + nota);
            }

            writer.close();
        } catch (Exception e) {
            System.err.println("Erro ao escrever ficheiro de saída: " + e.getMessage());
        }
    }

    public static Disciplina criarDisciplina(String nomeDisciplina, int capacidade, ArrayList<Aluno> alunos){
        String sigla = criarSigla(nomeDisciplina);

        Disciplina disciplina = new Disciplina(nomeDisciplina, sigla, capacidade);

        for (Aluno aluno : alunos) {
            disciplina.inscrever(aluno);
        }
        return disciplina;
    }


    public static String criarSigla (String nomeDisciplina) {
        String sigla = new String();

        for (char c: nomeDisciplina.toCharArray()) {
            if (Character.isUpperCase(c))
                sigla += c;
        }
        return sigla;
    }

    @Override
    public String toString() {

        String aux = nome + " (" + sigla + ") - cap: " + capacidade + "\n";

        for (Inscricao insc : inscricoes)
            aux += insc + "\n";

        return aux;
    }
}
