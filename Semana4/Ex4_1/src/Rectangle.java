public class Rectangle extends AbstractFigure {
    private int width;
    private int height;

    public Rectangle (int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle | Width:" + width + " | Height:" + height + " | At position: (" + getX() + ", " + getY() + ")";
    }
}
