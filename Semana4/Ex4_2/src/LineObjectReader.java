import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class LineObjectReader<T> {
    private File file;

    public LineObjectReader(File file) {
        this.file = file;
    }

    public List<T> read() throws FileNotFoundException {
        List<T> objects = new ArrayList<>();
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            T obj = lineToObject(s.nextLine());
            objects.add(obj);
        }

        return objects;
    }

    public abstract T lineToObject(String line);
}
