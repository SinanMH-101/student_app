

public class StudentApp {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.enrol();
        s1.payTuition();
        System.out.println(s1.showInfo());
    }
}
