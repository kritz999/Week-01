import java.util.*;
public class SmallestNum
{
	public static void main(String[]args)
	{

	Scanner sc = new Scanner(System.in);
	// enter the value of number1
	System.out.println("ENTER THE VALUE OF NUMBER1");
	int number1 =sc.nextInt();

	// enter the value of number2
	System.out.println("ENTER THE VALUE OF NUMBER2");
	int number2 =sc.nextInt();

	// enter the value of number3

	System.out.println("ENTER THE VALUE OF NUMBER3");
	int number3 =sc.nextInt();

 	//checking which number is smallest
	if(number1<number2 && number1<number3){
	System.out.println("Is the first number the smallest? YES");
	}else{
	System.out.println("Is the first number the smallest? NO");
	}

	}
}
	 

	








