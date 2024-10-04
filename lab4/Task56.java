package lab4;

public class Task56 {
    public static int getNegativeProduct(int[] array) {
        // Перевірка на null
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        // Якщо масив порожній
        if (array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }

        int product = 1;
        boolean found = false;

        // Перебір масиву по індексах, кратних 5
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0 && array[i] < 0) {
                product *= array[i];
                found = true;
            }
        }

        // Якщо не знайдено жодного від'ємного числа кратного 5
        if (!found) {
            throw new IllegalArgumentException("Не знайдено від'ємних чисел кратного 5");
        }

        return product;
    }

    public static void main(String[] args) {
        // Тестові масиви
        int[] array1 = {1, -5, 3, 4, 5, -6, 7, 8, 9, 10, -11, 12, 13, 14, -15, 16}; 
        int[] array2 = {1, 2, 3, 4, 5};  
        int[] array3 = null;  
        int[] array4 = {-1, -2, -3, -4, -5, -6, -7, -8, -9}; 
        
        // Виклики методу з різними масивами
        try {
            System.out.println("Добуток для array1: " + getNegativeProduct(array1));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println("Добуток для array2: " + getNegativeProduct(array2));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println("Добуток для array3: " + getNegativeProduct(array3));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println("Добуток для array4: " + getNegativeProduct(array4));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
