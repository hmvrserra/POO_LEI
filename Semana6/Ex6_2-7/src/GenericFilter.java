import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

    public static <T> Iterable<T> select(Iterable<T> iterable, Predicate<T> pred) {
        List<T> result = new ArrayList<>();

        for (T element : iterable) {
            if (pred.test(element)) {
                result.add(element);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("slb");
        stringList.add("");
        stringList.add("fcp");
        stringList.add("");
        stringList.add("scp");
        stringList.add("");
        Iterable<String> nonEmptyStrings = select(stringList, s -> !s.isEmpty() && !s.equals(" "));

        System.out.println("Strings não vazias:");
        for (String s : nonEmptyStrings) {
            System.out.println(s);
        }


        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(0);
        intList.add(-2);
        intList.add(2);
        intList.add(3);
        intList.add(-1);
        Iterable<Integer> positiveIntegers = select(intList, n -> n > 0);

        System.out.println("Números positivos:");
        for (Integer n : positiveIntegers) {
            System.out.println(n);
        }
    }
}
