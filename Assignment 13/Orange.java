public class Orange extends Fruit {
    public Orange(String color, String taste) {
        super(color, taste);
    }

    @Override
    public void display() {
        System.out.println("Fruit: Orange");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}
