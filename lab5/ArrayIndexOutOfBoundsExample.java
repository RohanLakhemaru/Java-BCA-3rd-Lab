package lab5;
public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Define an array with 5 elements
        int[] array = {1, 2, 3, 4, 5};

        // Define an index that is out of bounds
        int index = 10;

        // Try to access the array element at the specified index
        try {
            System.out.println("Accessing element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for the array.");
        }

        // Continue with normal program flow
        System.out.println("Program continues after handling the exception.");
    }
}
