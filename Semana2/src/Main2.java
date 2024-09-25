import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = Aluno.lerAlunos("Semana2/Estudantes.txt");

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
