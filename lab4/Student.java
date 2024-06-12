package lab4;
public class Student {
    private String name;
    private int age;
    private String faculty;

    // Constructor
    public Student(String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for faculty
    public String getFaculty() {
        return faculty;
    }

    // Setter for faculty
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Faculty: " + faculty);
    }
}

class TestStudent {
    public static void main(String[] args) {
        // Create three Student objects
        Student st1 = new Student("White", 20, "Computer Science");
        Student st2 = new Student("Black ", 19, "Mathematics");
        Student st3 = new Student("Brown", 21, "Physics");

        // Print details of each student
        st1.printDetails();
        st2.printDetails();
        st3.printDetails();

        // Determine the youngest student
        Student youngest = st1;
        if (st2.getAge() < youngest.getAge()) {
            youngest = st2;
        }
        if (st3.getAge() < youngest.getAge()) {
            youngest = st3;
        }

        // Print details of the youngest student
        System.out.println("\nYoungest Student:");
        youngest.printDetails();
    }
}
