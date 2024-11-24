package lab10.mira;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Institute {
    private String name;
    private List<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public List<Student> getHighScoringStudents() {
        List<Student> highScoringStudents = new ArrayList<>();
        for (Faculty faculty : faculties) {
            Iterator<Student> iterator = faculty.getStudents().iterator(); 
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    highScoringStudents.add(student);
                }
            }
        }
        return highScoringStudents;
    }
}
