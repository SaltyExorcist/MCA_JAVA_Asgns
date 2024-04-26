import java.util.Scanner;
public class Vehicle {
    private String brand;
    private String country_of_origin;
    private double base_price;

    // Constructor
    public Vehicle() {
        brand = "";
        country_of_origin = "";
        base_price = 0.0;
    }

    // Getter
    public double getBase_price() {
        return base_price;
    }

    // Method to input details of vehicle
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter brand:");
        brand = scanner.nextLine();
        System.out.println("Enter country of origin:");
        country_of_origin = scanner.nextLine();
        System.out.println("Enter base price:");
        base_price = scanner.nextDouble();
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + country_of_origin);
        System.out.println("Base Price: $" + base_price);
    }
}




