public class Cuboid extends Shape {
    public Cuboid(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    @Override
    public double volume() {
        return length * breadth * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}