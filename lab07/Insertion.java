package lab07;

public class Insertion implements Strategy {
    public void sort(byte[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            byte n = array[i];
            while (j >= 0 && n > array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = n;
        }
        for (byte num : array) {
            System.out.print( num + " ");
        }
        System.out.println();
    }
}
