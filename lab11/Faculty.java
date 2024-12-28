package lab11;

import java.util.Set;
import java.util.TreeSet;

public class Faculty {
    private String name;
    private Set<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new TreeSet<>(); 
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Факультет: " + name + ", Студенти: " + students;
    }
}
