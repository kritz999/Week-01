import java.util.*;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("ENTER THE VALUE OF number1");
        int number1 = sc.nextInt();
        System.out.println("ENTER THE VALUE OF number2");
        int number2 = sc.nextInt();
        
        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Printing the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}

