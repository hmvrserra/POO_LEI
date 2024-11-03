import java.util.Comparator;

public class ComparadorDeMusicas implements Comparator<Musica>{

    @Override
    public int compare(Musica m1, Musica m2){
        int durationComparison = Integer.compare(m1.getDuracao().totalSeconds(), m2.getDuracao().totalSeconds());
        if (durationComparison != 0)
            return durationComparison;
        return m1.getTitulo().compareTo(m2.getTitulo());
    }
}
