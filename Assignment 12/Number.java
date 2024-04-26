import java.util.Scanner;
public class Number {
    protected int[] array;

    // Constructor to initialize the array and input numbers
    public Number(int n) {
        array = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }

    // Method to display all values in the array
    public void display() {
        System.out.println("Array Values:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}





