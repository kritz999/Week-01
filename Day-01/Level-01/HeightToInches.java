import java.util.Scanner;

public class HeightToInches
{
	public static void main(String[] args)
	{
		// initialize cm, feet and inch variables
		double cm, feet, inch;

		// create our scanner object
		Scanner input = new Scanner(System.in);

		// take input in cms
		System.out.print("Enter height in centimeters: ");
		cm = input.nextInt();

		// convert cms to inch and feet
		inch = cm / 2.54;
		feet = inch / 12;

		System.out.print("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inch);

		input.close();
	}
}

