package lab03;

public class Task3 {
    public static void main(String[] args) {
        double epsilon = 1e-6;
                double sum = 0.0;
        double term;
        int i = 1;
        
        do {
            term = 1.0 / (i * (i + 1));
            
            sum += term;
            
            i++;
        } while (Math.abs(term) > epsilon);        
        System.out.printf("Обчислена сума з точністю %.10f: %.10f\n", epsilon, sum);
    }
}
