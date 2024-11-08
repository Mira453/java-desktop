package lab7;



public class Main {
    public static void main(String[] args) {
        
        SortContext context = new SortContext();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        int[] bubbleSortedArray = array.clone(); 
        context.setStrategy(new BubbleSort());
        context.sortArray(bubbleSortedArray);
        printArray(bubbleSortedArray);

        int[] quickSortedArray = array.clone();  
        context.setStrategy(new QuickSort());
        context.sortArray(quickSortedArray);
        printArray(quickSortedArray);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        

    }
}
