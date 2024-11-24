package lab10.olya;
import java.util.ArrayList;
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

    public Faculty getLargestFaculty() {
        Faculty largestFaculty = null;
        int maxStudents = 0;
        
        for (Faculty faculty : faculties) {
            if (faculty.getStudentCount() > maxStudents) {
                maxStudents = faculty.getStudentCount();
                largestFaculty = faculty;
            }
        }
        
        return largestFaculty;
    }
}
