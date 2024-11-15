package lab09;

public class Task7 {
    public static void main(String[] args) {
        
        String example1 = "dsfsd ddf eqqqwewewqewqe wew e342";
        String example2 = "";
        String example3 = "123 456 7890";
        
       
        printResults(example1);
        printResults(example2);
        printResults(example3);
    }
    public static int count(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Помилка! Речення не повинно повертати null.");
        }
        if (sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Помилка! Речення не повинно бути порожнім.");
        }

        
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static void printResults(String sentence) {
        try {
            int wordCount = Task7.count(sentence);
            System.out.println("Кількість слів: " + wordCount);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}
