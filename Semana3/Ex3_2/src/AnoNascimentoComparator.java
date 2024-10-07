import java.util.Comparator;
public class AnoNascimentoComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        if (a1.getAnoNascimento() == a2.getAnoNascimento()) {
            return Integer.compare(a1.getAnoMatricula(), a2.getAnoMatricula());
        }
        return Integer.compare(a1.getAnoNascimento(), a2.getAnoNascimento());
    }
}
