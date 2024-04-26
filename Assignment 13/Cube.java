public class Cube extends Shape {
    public Cube(double side) {
        super(side, side, side);
    }

    @Override
    public double volume() {
        return length * length * length;
    }

    @Override
    public double surfaceArea() {
        return 6 * length * length;
    }
}