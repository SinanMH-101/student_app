import java.util.ArrayList;

public class Student_2 {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private int tuition = 0;
    private ArrayList<String> courses = new ArrayList<>();
    private static int id = 10000;
    private static int courseTuition = 5000;

    public Student_2(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        setID();
    }

    private void setID() {
        studentId = String.valueOf(year) + String.valueOf(id);
        id++;
    }

    public void enroll(String course) {
        courses.add(course);
        tuition += courseTuition;
    }

    public void payTuition(int amount) {
        tuition -= amount;
    }

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentId +
                "\nCourses: " + String.join(", ", courses) +
                "\nTuition Remaining: $" + tuition;
    }

    public int getTuition() {
        return tuition;
    }
}
