package lab11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Institute {
    private String name;
    private Set<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new TreeSet<>(Comparator.comparing(Faculty::toString)); 
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public Set<Student> getHighScoringStudents() {
        Set<Student> highScoringStudents = new TreeSet<>();
        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getAverageGrade() >= 95) {
                    highScoringStudents.add(student);
                }
            }
        }
        return highScoringStudents;
    }
}
