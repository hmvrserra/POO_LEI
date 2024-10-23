import java.util.ArrayList;
import java.util.LinkedList;

public class Average {
    
    public static double average(Iterable<Integer> iterable) {
        int sum = 0;     
        int count = 0;   

        for (Integer value : iterable) {
            sum += value;
            count++;       
        }

        if (count == 0) {
            throw new IllegalArgumentException("O iterável está vazio.");
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        
        System.out.println("Média (ArrayList): " + average(arrayList));


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(15);
        linkedList.add(25);
        linkedList.add(35);
        
        System.out.println("Média (LinkedList): " + average(linkedList));
    }
}
