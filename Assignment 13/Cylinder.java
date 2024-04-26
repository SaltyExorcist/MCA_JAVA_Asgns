public class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, radius, height);
    }

    @Override
    public double volume() {
        return Math.PI * length * length * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
}