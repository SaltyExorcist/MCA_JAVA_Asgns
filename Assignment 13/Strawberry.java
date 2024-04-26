public class Strawberry extends Fruit {
    public Strawberry(String color, String taste) {
        super(color, taste);
    }

    @Override
    public void display() {
        System.out.println("Fruit: Strawberry");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}