public class Main {
    public static void main(String[] args) {

        SortedIntArray sortedArray = new SortedIntArray(new Descending());

        sortedArray.add(1);
        sortedArray.add(4);
        sortedArray.add(2);
        sortedArray.add(8);
        sortedArray.add(5);

        for (int i = 0; i < sortedArray.size(); i++)
            System.out.println(sortedArray.get(i));

    }
}