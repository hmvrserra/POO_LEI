import java.util.Iterator;

public class Interval implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Interval(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("O valor mínimo não pode ser maior que o valor máximo.");
        }
        this.min = min;
        this.max = max;
    }

    public static Interval naturals(int max) {
        return new Interval(1, max);
    }

    public static Interval arrayIndexes(int[] array) {
        return new Interval(0, array.length - 1);
    }


    public static Interval empty() {
        return new Interval(0, -1);
    }


    public boolean isEmpty() {
        return min > max;
    }

    public int size() {
        return isEmpty() ? 0 : (max - min + 1);
    }

    private class IntervalIterator implements Iterator<Integer> {
        private int current = min;

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new IllegalStateException("Não há mais elementos no intervalo.");
            }
            return current++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntervalIterator();
    }

    public static void main(String[] args) {
    	
        Interval test = new Interval(5, 7);
        for (Integer i : test) {
            System.out.println(i);
        }

        System.out.println("Média do intervalo: " + Average.average(test));
        
        System.out.println("\nIntervalo de numeros naturais ate 5: "  );
        Interval nat = Interval.naturals(5);
        for (Integer i : nat) {
            System.out.println(i);
        }
       
    }
}