import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private int tuition = 0;
    private String courses = "";
    private static int id = 10000;
    private static int courseTuition = 5000;

    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student's Last Name: ");
        this.lastName = in.nextLine();

        System.out.print(
                "[1] First Year \n[2] Second Year \n[3] Third Year \n[4] Fourth Year \nEnter which year the student is in: ");
        this.year = in.nextInt();

        setID();
        System.out.print(firstName + lastName + year + " " + studentId);
        in.close();

    }

    // Generate student ID
    private void setID() {
        studentId = String.valueOf(year) + String.valueOf(id);
        id++;
    }

    // Enroll in courses
    public void enrol() {
        while (true) {
            System.out.print("Enter a course to enroll in(Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            in.close();
            if (!course.equals("Q")) {
                courses = courses + " " + course;
                tuition += courseTuition;
            }
            if (course.equals("Q")) {
                break;
            }
        }

        // System.out.println("Courses enrolled in: " + courses);
    }

    // Pay tuition
    public void payTuition() {
        System.out.print("Payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuition -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        in.close();
        if (tuition <= 0) {
            System.out.println("All of your tuitions have been paid for");
        } else {
            System.out.println("You still have $" + tuition + " due.");
        }

    }

    // Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentId +
                " \nCourses:  " + courses +
                "\nTuition remaining: $" + tuition;
    }
}
