package lab7;

public class QuickSort implements SortStrategy {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                int temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[high] = array[++i];
        array[i] = pivot;
        return i;
    }
}
