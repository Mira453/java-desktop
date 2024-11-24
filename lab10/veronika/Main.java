package lab10.veronika;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Іван","Москаленко",0.0,"12321122");
        Student student2 = new Student("Назар","Майгун",55.5,"19345677");
        Student student3 = new Student("Руслан","Федчук",85.0,"1944444");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student3);
        students.add(student2);
        Faculty faculty = new Faculty("Факультет інформатики та обчислюваної техніки", students);
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        Institute institute = new Institute("KПІ", faculties);

        System.out.println("загальна кількість студентів, що навчається в інституті\n " + institute.getStudentsCount());
    }
}
