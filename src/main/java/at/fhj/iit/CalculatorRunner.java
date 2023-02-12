package at.fhj.iit;

/**
 * Runner for testing within Docker Container by starting java -jar ...
 */
public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator c = new CalculatorImpl();

        Double result = 0.0;
        Double number1 = Double.parseDouble(args[1]);
        Double number2 = Double.parseDouble(args[2]);
        String operation = args[0];

        switch (operation) {
            case "add":
                result = c.add(number1, number2);
                break;
            default:
                System.out.println("Please use <operation> <number1> <number2> to get matching results for <operation>");
                System.exit(0);
                break;
        }

        System.out.println(String.format("Result of Calculator: %,.2f %s %,.2f is %,.2f", number1, operation, number2, result));
    }

}
