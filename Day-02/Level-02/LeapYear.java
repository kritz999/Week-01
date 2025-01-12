import java.util.*;
public class LeapYear{
 	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE YEAR");
		int year = sc.nextInt();
		
			if(year>=1582 && year%4==0){
			      if(year%100==0){
					if(year%400==0){
						System.out.println(year+"the year is leap year");
							}else{
						System.out.println(year+"the year is not leap year");
							     }
							}
						else
			{
				System.out.print("The year " + year + " is a leap year");
			}
		}
		else
		{
			System.out.print("The year " + year + " is not a leap year");
		}

		
        	}
	}	
