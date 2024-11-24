package lab10.veronika;

import java.util.Iterator;
import java.util.List;
public class Institute {
    private String name;
    private List<Faculty> faculties;
    public Institute (String name, List<Faculty> faculties){
        this.name=name;
        this.faculties=faculties;
    }
    public int getStudentsCount() {
       int studentsCount = 0;

        Iterator facultyIterator = faculties.iterator();
        while (facultyIterator.hasNext()) {
            Faculty faculty = (Faculty) facultyIterator.next();
            Iterator studentIterator = faculty.getStudents().iterator();
            while (studentIterator.hasNext()) {
                studentIterator.next();
                studentsCount++;
            }
        }
        return studentsCount;
    }

}

