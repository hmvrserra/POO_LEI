import java.util.Iterator;
import java.util.NoSuchElementException;

public class WeekDayIterator implements Iterator<WeekDay> {
    private int currentIndex = 0;
    private final WeekDay[] days = WeekDay.values();

    @Override
    public boolean hasNext() {
        return currentIndex < days.length;
    }

    @Override
    public WeekDay next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Não há mais dias na semana.");
        }
        return days[currentIndex++];
    }
}
