package lab4;

public class Task26 {
    public static void main(String[] args) {
        int[] arr = {-1, 3, -5, 12, 6, 7, -10};
        double PosElemProduct = 1; //добуток додатних елементів
        int count = 0; //к-ть додатніх елементів

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
            {
                PosElemProduct *= i;
                count++;
            }
        }
        
        if (count>0)
        {
            double GeometricAvg = Math.pow(PosElemProduct, 1.0/count);
            System.out.println("Середнє геометричне: " + GeometricAvg);
        }
        else
        {
            System.out.println("Немає додатніх елементів!");
        }

    }
}
