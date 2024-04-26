public abstract class Fruit {
    protected String color;
    protected String taste;

    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}









