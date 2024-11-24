package lab10.veronika;

import java.util.List;
public class Faculty {
    private String name;
    private List<Student> students;
    public Faculty(String name,List<Student> students ){
        this.name=name;
        this.students = students;
    }
    public List<Student> getStudents (){
        return students;
    }
}
