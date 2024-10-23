import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {

    public static Iterable<String> select(Iterable<String> iterable, Predicate<String> pred) {
        List<String> result = new ArrayList<>();
        
        for (String s : iterable) { 
            if (pred.test(s)) {      
                result.add(s);      
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("");
        list.add("b");
        list.add("");

        Iterable<String> nonEmpty = select(list, s -> !s.isEmpty());

        System.out.println("Strings não vazias:");
        for (String s : nonEmpty) {
            System.out.println(s);
        }
    }
}
