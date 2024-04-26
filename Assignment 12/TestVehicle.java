public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Enter car details:");
        car.read();
        System.out.println("\nCar Details:");
        car.show();
    }
}