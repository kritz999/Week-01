import java.util.Scanner;

public class KmsToMiles
{
	public static void main(String[] args)
	{
		//First we initialize our distance variable
		double km;

		//Next we create scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//Taking distance as input
		km = input.nextDouble();

		//converting  km to miles using formula
		double miles = km / 1.6;

   System.out.print("The total miles is " + miles + " mile for the         given " + km + " km");

		input.close();
	}
}

