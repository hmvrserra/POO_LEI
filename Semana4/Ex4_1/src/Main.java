public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Rectangle r1 = new Rectangle(0, 0, 10, 20);
        Rectangle r2 = new Rectangle(0, 0, 20, 30);
        Rectangle r3 = new Rectangle(0, 0, 30, 40);
        canvas.addFigure(r1);
        canvas.addFigure(r2);
        canvas.addFigure(r3);
        System.out.println(canvas);
        canvas.deleteBiggestArea();
        System.out.println(canvas);
        System.out.println(canvas.calculateSumArea());
    }
}