import java.util.Scanner;
public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5); // Initialize stack with size 5
        Scanner sc=new Scanner(System.in);
        while(true) {
            // Menu driven program
            System.out.println("Menu:");
            System.out.println("1. Push an element into the stack.");
            System.out.println("2. Pop an element from the stack.");
            System.out.println("3. Peek inside the stack.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an element to push into the stack:");
                    int element=sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
