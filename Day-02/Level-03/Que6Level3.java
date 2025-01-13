import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter the operator +, -, *, / ");
        String op = sc.next();

        // Step 2: Use switch to perform operations based on the operator
        switch (op) {
            case "+":
                System.out.println("result: " + (first + second));
                break;

            case "-":
                System.out.println("result: " + (first - second));
                break;

            case "*":
                System.out.println("result: " + (first * second));
                break;

            case "/":
                // Check for division by zero
                if (second != 0) {
                    System.out.println("result:" + (first / second));
                } else {
                    System.out.println("Error division by zero is not allowed.");
                }
                break;

             default:
                System.out.println("Invalid Operator.");
                break;
        }

        
    }
}
