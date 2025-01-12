import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		// initialize our variables for both numbers
		float number1, number2;

		//creating our scanner object
		Scanner input = new Scanner(System.in);

		//taking inputs for both numbers
            System.out.print("Enter the first number: ");
		number1 = input.nextFloat();
            System.out.print("Enter the second number: ");
		number2 = input.nextFloat();

		// calculating values for the operations
		double add, subtract, multiply, divide;
		add = number1 + number2;
		subtract = number1 - number2;
		multiply = number1 * number2;
		divide = number1 / number2;

		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + subtract + ", " + multiply + ", and " + divide);

            input.close();
	}
}