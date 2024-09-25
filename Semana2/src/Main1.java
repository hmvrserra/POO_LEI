import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Zé", 111);
        Aluno a2 = new Aluno("Ana", 222);
        Aluno a3 = new Aluno("Rui", 333);
        Aluno a4 = new Aluno("Inês", 444);

        Disciplina poo = new Disciplina("Programacao Orientada para Objetos", "POO", 3);
        poo.inscrever(a1);
        poo.inscrever(a2);
        poo.inscrever(a3);
        poo.inscrever(a4);
        System.out.println(poo);

        Disciplina bd = new Disciplina("Bases de Dados", "BD", 4);
        bd.inscrever(a4);
        bd.inscrever(a1);
        System.out.println(bd);

//		ArrayList<Disciplina> disciplinas = lerDisciplinas(new File("disciplinas_ige.txt"));
//		for (Disciplina d : disciplinas)
//			System.out.println(d);

    }

    // Exemplo de método para leitura de um ficheiro de texto
    // com informação sobre disciplinas (ver formato nos slides)
    public static ArrayList<Disciplina> lerDisciplinas(File ficheiro) {

        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        try {
            Scanner fs = new Scanner(ficheiro);

            while(fs.hasNextLine()) {
                String sigla = fs.next();
                int cap = fs.nextInt();
                String nome = fs.nextLine();

                Disciplina d = new Disciplina(nome, sigla, cap);
                disciplinas.add(d);

            }
            fs.close();

        } catch (FileNotFoundException e) {
            System.err.println("Problemas na abertura do ficheiro");
        }

        return disciplinas;
    }
}