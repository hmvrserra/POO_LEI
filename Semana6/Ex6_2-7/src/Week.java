import java.util.Iterator;

public class Week implements Iterable<WeekDay> {
    @Override
    public Iterator<WeekDay> iterator() {
        return new WeekDayIterator();
    }


    public static void main(String[] args) {
        Week week = new Week(); 
        for (WeekDay day : week) {
            System.out.println(day); 
        }
    }
}
