package lab12.veronika;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Іван", "Москаленко", 0.0, "12321122");
        Student student2 = new Student("Назар", "Майгун", 55.5, "19345677");
        Student student3 = new Student("Руслан", "Федчук", 85.0, "1944444");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Faculty faculty = new Faculty("Факультет інформатики та обчислюваної техніки", students);

        Set<Faculty> faculties = new HashSet<>();
        faculties.add(faculty);

        Institute institute = new Institute("KПІ", faculties);

        System.out.println("Загальна кількість студентів, що навчається в інституті: " + institute.getStudentsCount());

        String searchId = "19345677";
        Student foundStudent = institute.findStudentById(searchId);
        System.out.println("Результат пошуку студента з ID " + searchId + ": " + (foundStudent != null ? foundStudent : "не знайдено"));
    }
}
