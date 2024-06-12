package lab4;
public class Employee {
    // Instance variables
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}
class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Ayus", 20, 600000000);

        // Set employee details
        employee.setName("Ayus");
        employee.setAge(20);
        employee.setSalary(600000000);

        // Print employee details
        employee.printDetails();
    }
}
