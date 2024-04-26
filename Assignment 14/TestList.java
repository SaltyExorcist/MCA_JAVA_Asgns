// Main.java
import java.util.Scanner;
import listpack.LinkedList;

public class TestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Create a Single Linked list");
            System.out.println("2. Add a node to the list");
            System.out.println("3. Traverse the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n; i++) {
                        int element = scanner.nextInt();
                        list.addNode(element);
                    }
                    break;
                case 2:
                    System.out.print("Enter the element to add: ");
                    int element = scanner.nextInt();
                    list.addNode(element);
                    break;
                case 3:
                    System.out.println("The elements in the list are:");
                    list.traverseList();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}