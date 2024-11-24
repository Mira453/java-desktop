package lab10.mira;
import java.util.List;

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

        List<Student> highScoringStudents = institute.getHighScoringStudents();
        System.out.println("Список студентів із середнім балом 95-100:");
        for (Student student : highScoringStudents) {
            System.out.println(student);
        }
    }
}
