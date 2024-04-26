public class Apple extends Fruit {
    public Apple(String color, String taste) {
        super(color, taste);
    }

    @Override
    public void display() {
        System.out.println("Fruit: Apple");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}