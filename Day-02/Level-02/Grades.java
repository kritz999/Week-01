import java.util.*;
 public class Grades{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		// enter the value of of marks from the user 

		double Chemistry = input.nextInt();
		double physics = input.nextInt();
		double maths = input.nextInt();
		
		//Calculating the average marks 
		double average = (Chemistry + physics + maths)/3;
		
		if(average>=80){
		System.out.println("The average marks is "+ average +" Grade is A "+ "Remark - above agency-normalized standard");
		}
		
		else if(average>=70&&average<=79){
		System.out.println("The average marks is "+average +" Grade is B "+ "Remark - at agency-normalized standards");}

		else if(average>=60 && average <=69){
		System.out.println("The average marks is "+average+" Grade is C " + "Remark - below but approaching agency-normalized standards");}

		else if(average>+50 && average <=59){
		System.out.println("The average marks is" + average+" Grade is D "+ "Remark - below agency-normalized standards");}

		else if(average>=40 && average<=49){
		System.out.println("The average marks is" + average+" Grade is E "+"Remark - too below agency-normalized standards");}
		else{
		System.out.println("Remedial standards");
		}


		}
	}
 

		
		