package lab7;

public class BubbleSort implements SortStrategy {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = array[maxIdx];
            array[maxIdx] = array[i];
            array[i] = temp;
        }
        System.out.println();
    }
}
