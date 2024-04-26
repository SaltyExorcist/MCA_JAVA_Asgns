public class TestShape {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Cylinder cylinder = new Cylinder(3, 7);
        Cuboid cuboid = new Cuboid(4, 6, 8);

        System.out.println("Cube:");
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface Area: " + cube.surfaceArea());

        System.out.println("\nCylinder:");
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());

        System.out.println("\nCuboid:");
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface Area: " + cuboid.surfaceArea());
    }
}
