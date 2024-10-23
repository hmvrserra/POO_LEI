import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Não há mais elementos a serem iterados.");
        }
        return array[currentIndex++];
    }


    public static void main(String[] args) {

        String[] stringArray = {"slb", "fcp", "scp"};
        ArrayIterator<String> stringIterator = new ArrayIterator<>(stringArray);

        System.out.println("Iterar o array de strings:");
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }


        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> intIterator = new ArrayIterator<>(intArray);

        System.out.println("\nIterar o array de inteiros:");
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }
    }
}
