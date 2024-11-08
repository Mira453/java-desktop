package lab7;

public class SortContext {
    private SortStrategy strategy;
        public void setStrategy(SortStrategy strategy) {
            this.strategy = strategy;
        }
        public void sortArray(int[] array) {
            strategy.sort(array);
        }
}
