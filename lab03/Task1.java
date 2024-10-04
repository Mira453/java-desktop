package lab03;

public class Task1 {
    //головний метод, містить виклики тестів
    public static void main(String[] args) {
        printResults(0,0);
        printResults(0,1);
        printResults(1,0);
        printResults(1,1);
        printResults(1,2);
        printResults(2,-10);
        printResults(20, 20);
        printResults(20, 29);
        printResults(-1, 10);
        printResults(1, 10);
        printResults(20,27);
        printResults(-10,30);
        printResults(-10, -10);
        printResults(Double.NaN, 1);
        printResults(Double.MAX_VALUE,1);
        printResults(Double.MAX_VALUE,-1);
    }

    //це метод який містить основну логіку обчислень
    public static double sum(double m, int k) {
        //перевірка умови завдання
        if (k > 30||k<=0) {
            throw new IllegalArgumentException("PARAM k = " + k);
        }

        double sum = 0;
        //цикл для обчислення суми числового ряду
        for (int i=1; i<=k; i++) {
            double temp = Math.sqrt(m*(1.0/i))*Math.sin(m*i);
            sum += temp;
        }
        return sum;
    }

    //метод виклику обчислень, та виводу їх результату на екран
    static void printResults(double m, int k) {
        System.out.print("m = "+ m + " k = " + k + " result: ");
        try {
            System.out.println(sum(m, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());

        }
    }
}


