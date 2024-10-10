public class Circle extends AbstractFigure{
    private int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle | Radius:" + radius + " | At position: (" + getX() + ", " + getY() + ")";
    }
}
