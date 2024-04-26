class MyNumber implements IntOperations {
    private int number;

    // Default constructor
    public MyNumber() {
        this.number = 0;
    }

    // Constructor with parameter
    public MyNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean isPositive(int num) {
        return num > 0;
    }

    @Override
    public boolean isNegative(int num) {
        return num < 0;
    }

    @Override
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    @Override
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    @Override
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        return num == reverse;
    }

    @Override
    public int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    @Override
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int getNumber() {
        return number;
    }
}