package lab12.mira;
import java.util.*;

public class Institute {
    private String name;
    private Set<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new HashSet<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public Map<String, List<Student>> getStudentsByFaculty() {
        Map<String, List<Student>> studentsByFaculty = new HashMap<>();
        for (Faculty faculty : faculties) {
            studentsByFaculty.put(faculty.getName(), new ArrayList<>(faculty.getStudents()));
        }
        return studentsByFaculty;
    }

    public Set<Student> getHighScoringStudents() {
        Set<Student> highScoringStudents = new HashSet<>();
        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    highScoringStudents.add(student);
                }
            }
        }
        return highScoringStudents;
    }
}
