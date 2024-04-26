import java.util.*;
public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the 2D array (n): ");
        int n = scanner.nextInt();

        TwoDArray obj1 = new TwoDArray(n);
        TwoDArray obj2 = new TwoDArray(n);

        System.out.println("Enter elements for first 2D array:");
        obj1.inputElements();

        System.out.println("Enter elements for second 2D array:");
        obj2.inputElements();

        System.out.println("Displaying first 2D array:");
        obj1.display();

        System.out.println("Displaying second 2D array:");
        obj2.display();

        OneDArray oneDArray1 = new OneDArray(n);
        OneDArray oneDArray2 = new OneDArray(n);

        obj1.splitIntoOneDArray(oneDArray1, oneDArray2);

        System.out.println("Displaying first 1D array of the first 2-D array:");
        oneDArray1.display();
        System.out.println("Displaying second 1D array of the first 2-D array:");
        oneDArray2.display();

        obj2.splitIntoOneDArray(oneDArray1, oneDArray2);

        System.out.println("Displaying first 1D array of the second 2-D array:");
        oneDArray1.display();
        System.out.println("Displaying second 1D array of the second 2-D array:");
        oneDArray2.display();

        TwoDArray additionResult = TwoDArray.addArrays(obj1, obj2);
        System.out.println("Addition Result:");
        additionResult.display();

        TwoDArray multiplicationResult = TwoDArray.multiplyArrays(obj1, obj2);
        System.out.println("Multiplication Result:");
        multiplicationResult.display();
    }
}
