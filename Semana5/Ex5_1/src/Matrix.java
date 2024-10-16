public class Matrix {
    private int data[];
    private int columns;
    private int rows;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows * columns];
    }

    public Matrix(int size){
        this(size, size);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getElement(int row, int column) {
        return data[row * columns + column];
    }

    public void setElement(int row, int column, int value) {
        data[row * columns + column] = value;
    }

    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= scalar;
        }
    }

    public boolean hasSameSize(Matrix other) {
        return this.rows == other.rows && this.columns == other.columns;
    }


}
