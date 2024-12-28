package lab11;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute("Технічний університет");

        Faculty faculty1 = new Faculty("Факультет комп'ютерних наук");
        faculty1.addStudent(new Student("Іван", "Іваненко", "CS001", 90.5));
        faculty1.addStudent(new Student("Марія", "Петренко", "CS002", 97.0));
        faculty1.addStudent(new Student("Олег", "Сидоренко", "CS003", 88.0));

        Faculty faculty2 = new Faculty("Факультет математики");
        faculty2.addStudent(new Student("Анна", "Коваль", "MATH001", 99.5));
        faculty2.addStudent(new Student("Сергій", "Лисенко", "MATH002", 94.0));

        institute.addFaculty(faculty1);
        institute.addFaculty(faculty2);

        System.out.println("Список студентів із середнім балом 95-100:");
        Set<Student> highScoringStudents = institute.getHighScoringStudents();
        for (Student student : highScoringStudents) {
            System.out.println(student);
        }
    }
}
