public class Banana extends Fruit {
    public Banana(String color, String taste) {
        super(color, taste);
    }

    @Override
    public void display() {
        System.out.println("Fruit: Banana");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}