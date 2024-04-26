public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws InvalidAgeException, InvalidNameException {
        if (age < 15 || age > 21) {
            throw new InvalidAgeException("Invalid age. Age should be between 15 and 21.");
        }
        this.age = age;

        if (!isValidName(name)) {
            throw new InvalidNameException("Invalid name. Name should not contain numbers or special characters.");
        }
        this.name = name;

        this.rollNo = rollNo;
        this.course = course;
    }

    private boolean isValidName(String name) {
        // Regular expression to check if the name contains only letters and spaces
        return name.matches("[a-zA-Z ]+");
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        try {
            // Creating a student object with valid data
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            student1.displayInfo();

            System.out.println();

            // Creating a student object with invalid age
            // This will throw InvalidAgeException
            Student student2 = new Student(2, "Alice", 22, "Physics");

            // Creating a student object with invalid name
            // This will throw InvalidNameException
            // Uncomment to test
            // Student student3 = new Student(3, "Bob123", 20, "Mathematics");
        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
