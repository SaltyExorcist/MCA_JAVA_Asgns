public class OddNum extends Number {
    protected int[] oddArray;
    protected int oddCount;

    // Constructor to count odd numbers and allocate memory
    public OddNum(int n) {
        super(n);
        oddCount = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        oddArray = new int[oddCount];
        copyOddNumbers();
    }

    // Method to copy odd numbers to own array
    private void copyOddNumbers() {
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddArray[index++] = num;
            }
        }
    }

    // Method to display all odd numbers
    public void displayOddNumbers() {
        System.out.println("Odd Numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}