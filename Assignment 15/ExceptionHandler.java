import java.util.Scanner;
public class ExceptionHandler {
    public static void main(String[] args) {
        //int[] array = new int[10];
        int array[]={1,2,3,4,5,6,7,8,9,10};
        try {
            // This line of code will throw an ArrayIndexOutOfBoundsException if
            // the specified index is greater than or equal to the length of the array.
            int value = array[10];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: array index out of bounds");
            System.err.println("Cause: " + e.getMessage());
        }
    }
}