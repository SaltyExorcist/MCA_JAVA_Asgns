public class Calculator {
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new FewArgumentsException("Few arguments provided. Expected format: [operand1] [operator] [operand2]");
            }
            int operand1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int operand2 = Integer.parseInt(args[2]);

            int result = 0;

            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result = operand1 / operand2;
                    break;
                case "%":
                    result = operand1 % operand2;
                    break;
                default:
                    throw new InvalidOperatorException("Invalid operator. Please use one of: +, -, *, /, %");
            }

            if (result < 0) {
                throw new NegativeResultException("Result is negative: " + result);
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (FewArgumentsException | InvalidOperatorException | NegativeResultException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}