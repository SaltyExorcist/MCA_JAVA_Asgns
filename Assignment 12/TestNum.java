import java.util.Scanner;
public class TestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        PrimeNum primeNum = new PrimeNum(size);

        System.out.println("\nAll Numbers:");
        primeNum.display();

        System.out.println("\nOdd Numbers:");
        primeNum.displayOddNumbers();

        System.out.println("\nPrime Numbers:");
        primeNum.displayPrimeNumbers();
    }
}
