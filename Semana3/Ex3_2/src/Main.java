import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Aluno[] alunos = {
                new Aluno(1, "Ana", 2020, 2002),
                new Aluno(3, "Bruno", 2021, 2003),
                new Aluno(2, "Carlos", 2019, 2002),
                new Aluno(4, "Ana", 2022, 2001)
        };
        System.out.println("Alunos antes de ordenar:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        Arrays.sort(alunos, new NumeroComparator());
        System.out.println("\nAlunos ordenados por número:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        Arrays.sort(alunos, new NomeComparator());
        System.out.println("\nAlunos ordenados por nome:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        Arrays.sort(alunos, new AnoNascimentoComparator());
        System.out.println("\nAlunos ordenados por ano de nascimento (caso sejam iguais desempata por ano de matrícula):");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }
}