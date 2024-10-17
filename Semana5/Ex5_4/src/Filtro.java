import java.util.ArrayList;
import java.util.List;

public class Filtro {
    public static List<String> filterWords(List<String> list, CriterioDeSelecao<String> criterio) {
        List<String> filtered = new ArrayList<>();
        for (String word : list) {
            if (criterio.cumpreOCriterio(word)) {
                filtered.add(word);
            }
        }
        return filtered;
    }
}