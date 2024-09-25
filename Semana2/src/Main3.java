import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args){
        ArrayList<Aluno> alunos = Aluno.lerAlunos("Semana2/Estudantes.txt");

        Disciplina disciplina = Disciplina.criarDisciplina("Programming", 3, alunos);

        System.out.println(disciplina);
    }
}
