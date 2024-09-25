public class Main4 {
    public static void main(String[] args){

        Disciplina disciplina = new Disciplina("Introdução à Programação", "IP", 100);

        Aluno aluno1 = new Aluno("José", 1);
        Aluno aluno2 = new Aluno("Maria", 2);
        Aluno aluno3 = new Aluno("João", 3);
        Aluno aluno4 = new Aluno("Ana", 4);
        Aluno aluno5 = new Aluno("Manuel", 5);

        disciplina.inscrever(aluno1);
        disciplina.inscrever(aluno2);
        disciplina.inscrever(aluno3);
        disciplina.inscrever(aluno4);

        disciplina.atualizarNota(aluno1, 12);
        disciplina.atualizarNota(aluno2, 15);
        disciplina.atualizarNota(aluno3, 0);

        disciplina.escreverFicheiroDeSaida(disciplina.getSigla());

        System.out.println(disciplina);
    }
}