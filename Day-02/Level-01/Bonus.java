import java.util.*;
public class Bonus {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		//input the salary and the year 

		System.out.println("ENTER THE YEAR");
		int year = sc.nextInt();

		System.out.println("ENTER SALARY");
		double salary = sc.nextDouble();

		if(year >5){
		double bonus = salary*0.05;
		System.out.println("The bonus amount " + bonus);

		}else{

		System.out.println(" Your service year is less then 5 years ");
		}

 	}
 }

		
		 