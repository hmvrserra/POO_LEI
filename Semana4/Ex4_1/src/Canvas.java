import java.util.ArrayList;

public class Canvas  {

    private ArrayList<Figure> figures;
    public Canvas(){
        figures = new ArrayList<>();
    }

    public void addFigure(Figure figure){
        figures.add(figure);
    }

    public void removeFigure(Figure figure){
        figures.remove(figure);
    }

    public Figure getBiggestArea(){
        if (figures.isEmpty()){
            throw new IllegalStateException("No figures in the canvas");
        }

        Figure biggest = null;
        double maxArea = 0;
        for (Figure fig : figures){
            if (fig.getArea() > maxArea){
                maxArea = fig.getArea();
                biggest = fig;
            }
        }
        return biggest;
    }

    public void deleteBiggestArea(){
        if (figures.isEmpty()){
            throw new IllegalStateException("No figures in the canvas");
        }
        Figure biggest = getBiggestArea();
        figures.remove(biggest);
    }

    public double calculateSumArea(){
        double area = 0;
        for (Figure fig : figures){
            area += fig.getArea();
        }
        return area;
    }

    public String toString(){
        String str = "";
        for (Figure fig : figures){
            str += fig.toString() + "\n";
        }
        return str;
    }
}
