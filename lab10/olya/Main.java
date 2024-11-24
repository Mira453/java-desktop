package lab10.olya;

public class Main {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Engineering");
        faculty1.addStudent(new Student("Vanya"));
        faculty1.addStudent(new Student("Pasha"));

        Faculty faculty2 = new Faculty("Mathematics");
        faculty2.addStudent(new Student("Anna"));
        faculty2.addStudent(new Student("Olga"));
        faculty2.addStudent(new Student("Kolya"));

  
        Institute institute = new Institute("Tech University");
        institute.addFaculty(faculty1);
        institute.addFaculty(faculty2);

        Faculty largestFaculty = institute.getLargestFaculty();
        if (largestFaculty != null) {
            System.out.println("Факультет з найбільшою кількістю студентів: " + largestFaculty.getName());
        } else {
            System.out.println("Факультетів немає.");
        }
    }
}
