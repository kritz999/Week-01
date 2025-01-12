import java.util.*;
public class Natural
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("ENTER THE VALUE OF NATURAL NUMBER WHICH INCLUES 0 TO N");
	int number = sc.nextInt();
	//checking the number is natural that is it will be greater then or equals to 1
	
	if(number>=1){
	
	//finding the sum of natural numbers
	int sum = number*(number+1)/2;
	System.out.println("The sum of " + number + " natural number is "+ sum);
	}else{
	System.out.println("The number is " + number + " is not a natural number ");
	}
}
}	
	