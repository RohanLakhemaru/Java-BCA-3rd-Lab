package lab4;
public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    // Parameterized constructor to initialize Person fields
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to display person details
    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private String faculty;

    // Parameterized constructor to initialize Student fields
    public Student(String firstName, String lastName, int age, String faculty) {
        super(firstName, lastName, age);
        this.faculty = faculty;
    }

    // Override showInfo method to include faculty
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Faculty: " + faculty);
    }
}
class Teacher extends Person {
    private double salary;

    // Parameterized constructor to initialize Teacher fields
    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    // Override showInfo method to include salary
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Salary: " + salary);
    }
}
class TestClass {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", "Johnson", 20, "Computer Science");
        // Create a Teacher object
        Teacher teacher = new Teacher("Bob", "Smith", 45, 75000.50);

        // Display student details
        System.out.println("Student Information:");
        student.showInfo();
        System.out.println();

        // Display teacher details
        System.out.println("Teacher Information:");
        teacher.showInfo();
    }
}

