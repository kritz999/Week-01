import java.util.*;
 public class LeapYear2{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF YEAR");



		//Checking if year is leap year or not
		if ((year >= 1582 && year % 4) == 0 && (year % 400) == 0) || (year >= 1582 && year % 4) == 0 && (year % 100) != 0))
		{
			System.out.print("The year " + year + " is a leap year");
		}
		else
		{
			System.out.print("The year " + year + " is not a leap year");
		}

		}
        }
