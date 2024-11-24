package lab10.mira;

class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private double averageGrade;

    public Student(String firstName, String lastName, String studentId, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + studentId + ", Середній бал: " + averageGrade + ")";
    }
}
