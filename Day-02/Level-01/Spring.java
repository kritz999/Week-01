import java.util.*;
public class SpringSeason{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		//taking input of month from user
		System.out.println("ENTER THE VALUE OF MONTH");
		int month = sc.nextInt();
		//taking input of day from the user
		System.out.println("ENTER THE VALUE OF DAY");
		int day = sc.nextInt();
		if((month==3&&day>=20)||(month==4 &&day >= 1 && day <= 30)||(month==5&& day >= 1 && day <= 31)||(month==6&&day >= 1 &&day>=20))
		{
		System.out.println("Its a Spring Season");
		}
		else{
		System.out.println("Not a Spring Season");
		}
	}
	
}
		
		
	
	
	