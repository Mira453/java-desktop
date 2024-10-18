package lab05;

public class Task7 {
    public static void main(String[] args)
    {
        printResults(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        });
        printResults(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 11}
        });
        printResults(new int[][]{{}});
        printResults(new int[][]{null});
        printResults(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        });

    }
    public static int[][] getTransposed(int[][] matrix)
    {
        if (matrix == null) {
            throw new NullPointerException();
        }

        if (matrix.length == 0 || matrix[0].length == 0 ){
            throw new IllegalArgumentException("матриця не може бути пустою");
        }

        for (int i = 1; i < matrix.length; i++){
            if(matrix[i].length != matrix[0].length){
                throw new IllegalArgumentException("неоднакова кількість елементів");
            }
        }

        int[][] tr = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tr[j][i] = matrix[i][j];
            }
        }

        return tr;
    }

    public static void printResults(int[][] matrix){
        try {
            int[][] transposed = getTransposed(matrix);
            System.out.println();
            System.out.println("Транспонована матриця: ");
            for(int i = 0; i < transposed.length; i++){
                for(int j = 0; j < transposed[0].length; j++){
                    System.out.print(transposed[i][j] + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println();
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

}
