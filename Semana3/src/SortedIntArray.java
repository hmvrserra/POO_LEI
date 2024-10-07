import java.util.ArrayList;

public class SortedIntArray {
    private ArrayList<Integer> array;
    private SortingPolicy policy;

    public SortedIntArray(SortingPolicy policy) {
        this.policy = policy;
        this.array = new ArrayList<Integer>();
    }

    public int size() {
        return array.size();
    }

    public void add (int element) {
        int i = 0;
        while (i < array.size() && policy.isBefore(array.get(i), element)) {
            i++;
        }
        array.add(i, element);
    }

    public int get(int index) {
        return array.get(index);
    }
}
