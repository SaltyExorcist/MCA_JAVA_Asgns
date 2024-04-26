public abstract class Shape {
    protected double length;
    protected double breadth;
    protected double height;

    public Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double volume();
    public abstract double surfaceArea();
}
