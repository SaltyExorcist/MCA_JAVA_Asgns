public class NullPointerTest{
    public static void main(String[] args) {
        String str = null;

        try {
            // Trying to get the length of a null string
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
