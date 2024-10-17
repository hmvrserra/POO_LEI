import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Aluno[] alunosArray = {
                new Aluno(1233, "Pedro", 2022, 2000),
                new Aluno(234, "Rita", 1999, 1990),
                new Aluno(345, "João", 1991, 1982),
        };

        ArrayList<Aluno> alunosList = new ArrayList<>(Arrays.asList(alunosArray));

        System.out.println("\nOrdenação de ArrayList por número:");
        alunosList.sort((a1, a2) -> Integer.compare(a1.numero, a2.numero));
        for (Aluno aluno : alunosList) {
            System.out.println(aluno);
        }

        System.out.println("\nOrdenação de ArrayList por nome (alfabeticamente):");
        alunosList.sort((a1, a2) -> String.CASE_INSENSITIVE_ORDER.compare(a1.nome, a2.nome));
        for (Aluno aluno : alunosList) {
            System.out.println(aluno);
        }
    }
}