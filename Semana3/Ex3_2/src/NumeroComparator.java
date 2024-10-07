import java.util.Comparator;
public class NumeroComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Integer.compare(a1.getNumero(), a2.getNumero());
    }
}
