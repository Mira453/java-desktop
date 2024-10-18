package lab05;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        printResults(new int[][]{
            {3, 2, 5, 4},
            {5, 23, 7, 8}
    });
        printResults(new int[][]{null});
        printResults(new int[][]{{}});
        printResults(new int[][] {
            {2, 8, 78}
        });
        printResults(new int[][] {
            {1, 2, 3, 4, 5,},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        });
    }
    public static void lolSwap(int[][] matrix) {
        if (matrix == null){
            throw new NullPointerException();
        }
        if (matrix.length == 0 || matrix[0].length == 0 ){
            throw new IllegalArgumentException("Помилка! Матриця не може бути пустою");
        }
        if (matrix.length < 2) {
            throw new IllegalArgumentException("Помилка! Повинно бути більше рядків"); 
        }

        int[][] newMatrix =  Arrays.copyOf(matrix, matrix.length);
        newMatrix[0] = matrix[matrix.length - 1];
        newMatrix[matrix.length - 1] = matrix[0];
        for(int i = 0; i < newMatrix.length; i++){
            for(int j = 0; j < newMatrix[i].length; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    } 


    static void printResults(int[][] matrix){
        try { lolSwap(matrix);

        }catch(IllegalArgumentException | NullPointerException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }   
    }
}
