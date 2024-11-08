package lab07;

public class ContextSort {
    private Strategy strategy;
        public void set(Strategy strategy) {
            this.strategy = strategy;
        }
    
        public void execute(byte[] array) {
            if (strategy != null) {
                strategy.sort(array);
            } else {
                System.out.println("не заданий");
            }
        }
}
