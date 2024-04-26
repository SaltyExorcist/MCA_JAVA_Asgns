public class TestFruit {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet");
        Banana banana = new Banana("Yellow", "Sweet");
        Orange orange = new Orange("Orange", "Sweet and Tangy");
        Strawberry strawberry = new Strawberry("Red", "Sweet and Tart");

        apple.display();
        banana.display();
        orange.display();
        strawberry.display();
    }
}
