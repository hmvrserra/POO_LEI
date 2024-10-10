import java.io.File;

public class LineCircleReader extends LineObjectReader<Circle> {

    public LineCircleReader(File file) {
        super(file);
    }

    @Override
    public Circle lineToObject(String line) {
        String[] parts = line.split(",");
        int x = Integer.parseInt(parts[0].trim());
        int y = Integer.parseInt(parts[1].trim());
        int radius = Integer.parseInt(parts[2].trim());
        return new Circle(x, y,radius);
    }
}