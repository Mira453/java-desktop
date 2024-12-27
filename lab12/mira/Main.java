package lab12.mira;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute("Технічний університет");

        Faculty faculty1 = new Faculty("Факультет комп'ютерних наук");
        faculty1.addStudent(new Student("Іван", "Іваненко", "CS001", 96.5));
        faculty1.addStudent(new Student("Марія", "Петренко", "CS002", 92.0));
        faculty1.addStudent(new Student("Олег", "Сидоренко", "CS003", 97.2));

        Faculty faculty2 = new Faculty("Факультет математики");
        faculty2.addStudent(new Student("Анна", "Коваль", "MATH001", 99.0));
        faculty2.addStudent(new Student("Сергій", "Лисенко", "MATH002", 89.0));

        institute.addFaculty(faculty1);
        institute.addFaculty(faculty2);

        System.out.println("Список студентів із середнім балом 95-100:");
        for (Student student : institute.getHighScoringStudents()) {
            System.out.println(student);
        }

        System.out.println("\nСтуденти за факультетами:");
        Map<String, List<Student>> studentsByFaculty = institute.getStudentsByFaculty();
        for (Map.Entry<String, List<Student>> entry : studentsByFaculty.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
