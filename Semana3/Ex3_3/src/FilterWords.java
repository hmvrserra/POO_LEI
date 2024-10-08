public class FilterWords implements CriterioDeSelecao<String> {
    private int minSize;
    public FilterWords(int minSize) {
        this.minSize = minSize;
    }
    @Override
    public boolean cumpreOCriterio(String elem) {
        return elem.length() >= minSize;
    }
}
