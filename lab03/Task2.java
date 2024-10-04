package lab03;

public class Task2 {
    
    public static void main(String[] args) {
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, -10);
        printResults(20, 20);
        printResults(21, 21);
        printResults(43, 14);
        printResults(12, -23);
        printResults(1, 10);
        printResults(-1, 10);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);
    }


    public static double sum (int n, double t){
        if(n <= 0){
            throw new IllegalArgumentException("param n = " + n);
        }
        double result = 0;
        if(t < 0){
            for( int i = 1; i <= n; i++){
                result += t * t * i;
            }
        }else{
            for( int i = 1; i <= n; i++){
                result += Math.sqrt(t * i);
            }
        }
        return result;
    }

    static void printResults(int n, double t){
        System.out.print("n:" + n + " t:" + t + " result:");
        try{
            System.out.println(sum(n, t));
        }catch(IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
