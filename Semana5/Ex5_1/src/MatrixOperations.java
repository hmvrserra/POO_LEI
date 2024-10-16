public class MatrixOperations {
    public static Matrix sumAndScale(Matrix a, Matrix b, int scalar) {
        if (!a.hasSameSize(b)) {
            throw new IllegalArgumentException("As matrizes devem ter a mesma dimensão");
        }

        Matrix result = new Matrix(a.getRows(), a.getColumns());

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getColumns(); j++) {
                result.setElement(i, j, a.getElement(i, j) + b.getElement(i, j));
            }
        }

        result.multiplyByScalar(scalar);
        return result;
    }
}
