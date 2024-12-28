package lab13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Комп'ютерні науки", 3); 

        try {
            group.addStudent(new Student("Іван"));
            group.addStudent(new Student("Марія"));
            group.addStudent(new Student("Олег"));
            group.addStudent(new Student("Анна")); 
        } catch (MaxStudentsReachedException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Список студентів у групі: " + group.getStudents());
        }

        try {
            String nullString = null;
            System.out.println(nullString.length());
        } catch (NullPointerException e) {
            System.out.println("RuntimeException оброблено: NullPointerException");
        }

        try {
            int invalidIndex = 10;
            List<String> list = new ArrayList<>();
            System.out.println(list.get(invalidIndex)); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("RuntimeException оброблено: IndexOutOfBoundsException");
        }
    }
}
