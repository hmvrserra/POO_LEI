import java.util.Comparator;
public class NomeComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return String.CASE_INSENSITIVE_ORDER.compare(a1.getNome(), a2.getNome());
    }

}
