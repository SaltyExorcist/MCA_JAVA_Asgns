public class PrimeNum extends OddNum {
    private int[] primeArray;
    private int primeCount;

    // Constructor to count prime numbers and allocate memory
    public PrimeNum(int n) {
        super(n);
        primeCount = 0;
        for (int num : oddArray) {
            if (isPrime(num)) {
                primeCount++;
            }
        }
        primeArray = new int[primeCount];
        copyPrimeNumbers();
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to copy prime numbers to own array
    private void copyPrimeNumbers() {
        int index = 0;
        for (int num : oddArray) {
            if (isPrime(num)) {
                primeArray[index++] = num;
            }
        }
    }

    // Method to display all prime numbers
    public void displayPrimeNumbers() {
        System.out.println("Prime Numbers:");
        for (int num : primeArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}