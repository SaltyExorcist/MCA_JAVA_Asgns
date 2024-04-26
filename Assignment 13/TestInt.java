import java.util.Scanner;
public class TestInt {
    public static void main(String[] args) {
        // Create object of MyNumber class

        Scanner sc=new Scanner(System.in);
        // Input a number
        System.out.println("Enter a no:");
        int number = sc.nextInt();

        MyNumber myNumber = new MyNumber(number);

        // Menu driven program
        System.out.println("Menu:");
        System.out.println("1. Check if the number is positive");
        System.out.println("2. Check if the number is negative");
        System.out.println("3. Check if the number is even");
        System.out.println("4. Check if the number is odd");
        System.out.println("5. Check if the number is prime");
        System.out.println("6. Check if the number is palindrome");
        System.out.println("7. Calculate factorial of the number");
        System.out.println("8. Calculate sum of digits of the number");

        // Assuming user's choice for demonstration
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Is the number positive? " + myNumber.isPositive(number));
                break;
            case 2:
                System.out.println("Is the number negative? " + myNumber.isNegative(number));
                break;
            case 3:
                System.out.println("Is the number even? " + myNumber.isEven(number));
                break;
            case 4:
                System.out.println("Is the number odd? " + myNumber.isOdd(number));
                break;
            case 5:
                System.out.println("Is the number prime? " + myNumber.isPrime(number));
                break;
            case 6:
                System.out.println("Is the number palindrome? " + myNumber.isPalindrome(number));
                break;
            case 7:
                System.out.println("Factorial of the number: " + myNumber.factorial(number));
                break;
            case 8:
                System.out.println("Sum of digits of the number: " + myNumber.sumOfDigits(number));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
