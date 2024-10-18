package lab06;

import java.util.Arrays;
 
public class Task1 {
    public static void main(String[] args) {
    printResults(new byte[] {1, 6, 8, 3, 9, 0});
    printResults(new byte[] {3, 5, 1, 5, 3, 0});
    printResults(new byte[] {});
    printResults(new byte[] {6, 6, 6, 0, 5});
    }

    public static byte[] selectionSort(byte[] array){
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length == 0){
            throw new IllegalArgumentException("Масив порожній!");
        }

        for(int i = 0; i < array.length - 1; i++){
            int maxIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIdx]) {
                    maxIdx = j;
                }
            }
            
            byte temp = array[maxIdx];
            array[maxIdx] = array[i];
            array[i] = temp;
            
        }
        return array;
    }
    public static void printResults(byte[] array){
        try {
            System.out.println("Початковий масив: " + Arrays.toString(array));

            byte[] result = selectionSort(array);

            System.out.println("Відсортований масив: " + Arrays.toString(result));

            System.out.println();
        }catch (IllegalArgumentException | NullPointerException e) {
            System.out.println();
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

}  

    
