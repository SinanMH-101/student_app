import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGUI {
    private JFrame frame;
    private JTextField firstNameField, lastNameField, courseField, paymentField;
    private JComboBox<String> yearCombo;
    private JTextArea outputArea;
    private Student_2 currentStudent;

    public StudentGUI() {
        frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLayout(new GridLayout(0, 1));

        // Input panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        panel.add(firstNameField);

        panel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        panel.add(lastNameField);

        panel.add(new JLabel("Year:"));
        yearCombo = new JComboBox<>(new String[]{"1", "2", "3", "4"});
        panel.add(yearCombo);

        JButton registerBtn = new JButton("Register Student");
        panel.add(registerBtn);
        frame.add(panel);

        // Course enrollment
        JPanel coursePanel = new JPanel(new FlowLayout());
        courseField = new JTextField(10);
        JButton enrollBtn = new JButton("Enroll Course");
        coursePanel.add(new JLabel("Course:"));
        coursePanel.add(courseField);
        coursePanel.add(enrollBtn);
        frame.add(coursePanel);

        // Tuition payment
        JPanel paymentPanel = new JPanel(new FlowLayout());
        paymentField = new JTextField(10);
        JButton payBtn = new JButton("Pay Tuition");
        paymentPanel.add(new JLabel("Pay: $"));
        paymentPanel.add(paymentField);
        paymentPanel.add(payBtn);
        frame.add(paymentPanel);

        // Output
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea));

        // Actions
        registerBtn.addActionListener(e -> {
            String fname = firstNameField.getText();
            String lname = lastNameField.getText();
            int year = Integer.parseInt((String) yearCombo.getSelectedItem());
            currentStudent = new Student_2(fname, lname, year);
            outputArea.setText("Student Registered!\n" + currentStudent.showInfo());
        });

        enrollBtn.addActionListener(e -> {
            if (currentStudent != null) {
                String course = courseField.getText();
                currentStudent.enroll(course);
                outputArea.setText("Course Enrolled!\n" + currentStudent.showInfo());
            }
        });

        payBtn.addActionListener(e -> {
            if (currentStudent != null) {
                try {
                    int amount = Integer.parseInt(paymentField.getText());
                    currentStudent.payTuition(amount);
                    outputArea.setText("Payment Processed!\n" + currentStudent.showInfo());
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid amount.");
                }
            }
        });

        frame.setVisible(true);
    }

   
}
