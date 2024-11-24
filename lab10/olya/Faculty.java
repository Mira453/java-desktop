package lab10.olya;
import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public int getStudentCount() {
        return students.size();
    }
}
