public class TestException {
    public static void main(String[] args) {
        char input = args[0].charAt(0);

        try {
            if (input == 'X') {
                throw new ExitException("Exit requested");
            } else if (input == ' ') {
                throw new BlankException("Blank space found");
            } else if ("AEIOUaeiou".indexOf(input) != -1) {
                throw new VowelException("Vowel found");
            } else {
                System.out.println("Valid character");
            }
        } catch (VowelException e) {
            System.out.println("VowelException caught: " + e.getMessage());
        } catch (BlankException e) {
            System.out.println("BlankException caught: " + e.getMessage());
        } catch (ExitException e) {
            System.out.println("ExitException caught: " + e.getMessage());
            // Terminate the program
            System.exit(0);
        }
    }
}