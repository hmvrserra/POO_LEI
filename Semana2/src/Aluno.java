import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private int numero;

    public Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public static ArrayList<Aluno> lerAlunos(String nomeFicheiro) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        File file = new File (nomeFicheiro);
        try {
            Scanner scanner = new Scanner(new File(nomeFicheiro));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ", 2);
                int num = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                Aluno aluno = new Aluno(name, num);
                alunos.add(aluno);
            }

            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado: " + nomeFicheiro);
        }
        return alunos;
    }



    @Override
    public String toString() {
        return numero + ": " + nome;
    }

}
