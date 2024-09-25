public class Main4 {
    public static void main(String[] args){
        Disciplina disciplina = Disciplina.criarDisciplina("Programação Orientada para Objetos", 5, Aluno.lerAlunos("Semana2/Estudantes.txt"));

        disciplina.escreverFicheiroDeSaida(disciplina);

        System.out.println(disciplina);
    }
}
