package lab09;

public class HexConverter {

    public static String intToHexString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Число має бути додатнім");
        }
        
        String hexString = Integer.toHexString(i).toUpperCase();
        return hexString;
    }

    public static void main(String[] args) {
        int argument = 51966;
        String result = intToHexString(argument);
        
        System.out.println("Аргумент: " + argument);
        System.out.println("Результат: " + result); 
        
        try {
            int negativeArgument = -1;
            String negativeResult = intToHexString(negativeArgument);
            System.out.println("Результат для від'ємного аргумента: " + negativeResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
