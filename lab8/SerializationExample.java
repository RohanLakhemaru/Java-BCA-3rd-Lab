package lab8;
import java.io.*;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}


public class SerializationExample {

    // Method to serialize an object to a file
    public static void serializeObject(String filename, Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Object has been serialized to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }
    }

    // Method to deserialize an object from a file
    public static Student deserializeObject(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {
        String filename = "student.ser";

        // Create a new Student object
        Student std = new Student("Ayus", 24700000);

        // Serialize the Student object to a file
        serializeObject(filename, std);

        // Deserialize the Student object from the file
        Student deserializedStudent = deserializeObject(filename);

        // Display the contents of the deserialized Student object
        if (deserializedStudent != null) {
            System.out.println("Deserialized Student Object:");
            System.out.println(deserializedStudent);
        }
    }
}

