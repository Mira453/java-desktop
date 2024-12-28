package lab13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private int maxStudents;
    private List<Student> students;

    public Group(String groupName, int maxStudents) {
        this.groupName = groupName;
        this.maxStudents = maxStudents;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) throws MaxStudentsReachedException {
        if (students.size() >= maxStudents) {
            throw new MaxStudentsReachedException("Група " + groupName + " досягла максимальної кількості студентів: " + maxStudents);
        }
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + students +
                '}';
    }
}
