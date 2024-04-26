import java.util.Scanner;

class Car extends Vehicle {
    private String model;
    private double speed;
    private double market_price;

    // Constructor
    public Car() {
        super();
        model = "";
        speed = 0.0;
        market_price = 0.0;
    }

    // Method to calculate market price
    private void calculateMarketPrice() {
        if (speed > 80) {
            market_price = getBase_price() * 1.15; // 15% more than base price
        } else {
            market_price = getBase_price() * 0.95; // 5% less than base price
        }
    }

    // Method to input car details
    public void read() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model:");
        model = scanner.nextLine();
        System.out.println("Enter speed (in km/hr):");
        speed = scanner.nextDouble();
        calculateMarketPrice();
    }

    // Method to show car details
    public void show() {
        super.display();
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/hr");
        System.out.println("Market Price: $" + market_price);
    }
}