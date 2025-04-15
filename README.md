# Student Management GUI Application

This is a simple Java-based desktop application that allows users to manage student registrations, enroll students in courses, process tuition payments, and display student information. I first made the simple version when I was first learning how to program, and then decided to use it to practice Java Swing to make a graphical user interface (GUI). 

##  Features

- Register a new student (first name, last name, academic year)
- Automatically generate a student ID
- Enroll the student in multiple courses
- Calculate and display total tuition fees
- Allow partial or full tuition payment
- Display a student summary including enrolled courses and payment status

---

##  Technologies Used

| Technology     | Purpose                           |
|----------------|-----------------------------------|
| Java           | Core programming language         |
| Java Swing     | GUI components (JFrame, JPanel, JTextField, etc.) |
| OOP Principles | Used to structure Student objects and encapsulate data |

---

## What I Learned

Working on this project taught me several fundamental and practical programming skills:

- **Object-Oriented Design**  
  I practiced encapsulation, constructor usage, and method-based behavior to create reusable and maintainable class designs (e.g., the `Student` class).

- **Java Swing GUI Development**  
  I learned how to build interactive windows using `JFrame`, layout managers (`GridLayout`, `FlowLayout`), and how to wire up event listeners to respond to user actions.

- **User Input Handling & Validation**  
  I implemented various input fields with proper handling for data types and formats, including input parsing and error prevention (e.g., invalid number inputs).

- **Real-Time Updates in GUI**  
  I used `JTextArea` to display live updates of student data and ensure a responsive user experience without needing to restart the app.

- **Application Structure & Modularity**  
  I split the application into multiple classes/files (`Student.java` and `StudentGUI.java`) for better code organization, readability, and reusability.

---

## Getting Started

### Requirements

- Java Development Kit (JDK 8 or later)

### Compile and Run

```bash
//for the gui version
javac Student_2.java StudentGUI.java app.java
java app.java

//for the simple version
javac Student.java StudentApp.java
java StudentApp.java
