import java.util.Comparator;
public class AnoMatriculaComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Integer.compare(a1.getAnoMatricula(), a2.getAnoMatricula());
    }
}
