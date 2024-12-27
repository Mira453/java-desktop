package lab12.veronika;
import java.util.Set;


public class Faculty {
    private final String name;
    private Set<Student> students;

    public Faculty(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }


    public Set<Student> getStudents() {
        return students;
    }

}
