package lab4;

public class Task65 {
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Масив не може бути null");
        }
    
        int length = arr.length;
        int[] reversed = new int[length];
    
        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }
    
        return reversed;
    }
}