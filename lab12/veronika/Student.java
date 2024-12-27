package lab12.veronika;

public class Student {
    private String firstName;
    private String lastName;
    private double averageGrade;
    private String id;

    public Student(String firstName, String lastName, double averageGrade, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + ", averageGrade=" + averageGrade + ", id='" + id;
    }
}
