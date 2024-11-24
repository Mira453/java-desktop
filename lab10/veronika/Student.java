package lab10.veronika;

public class Student {
    private String firstName;
    private String lastName;
    private double averageGrade;
    private String id;

    public Student(String firstName,String lastName, double averageGrade, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.averageGrade = averageGrade;
    }
}
