import java.util.ArrayList;

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

    @Override
    public String toString() {

        String aux = nome + " (" + sigla + ") - cap: " + capacidade + "\n";

        for (Inscricao insc : inscricoes)
            aux += insc + "\n";

        return aux;
    }
}
