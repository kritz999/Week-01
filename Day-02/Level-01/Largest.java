import java.util.*;
public class Largest
{
	public static void main(String[] args)
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF NUMBER 1");
	int number1 = sc.nextInt();
	System.out.println("ENTER THE VALUE OF NUMBER 2");
	int number2 = sc.nextInt();
	System.out.println("ENTER THE VALUE OF NUMBER 2");
	int number3= sc.nextInt();

	//checking is the first number is the largest
	if ((number1>number2)&&(number1>number3)){
	System.out.println("Is the first number the largest? YES");
	}else{
	System.out.println("Is the first number the largest? NO");
	}


	//checking is the second number is the largest
	if ((number2>number1)&&(number2>number3)){
	System.out.println("Is the second number the largest? YES");
	}else{
	System.out.println("Is the second number the largest? NO");
	}

	if ((number3>number1)&&(number3>number2)){
	System.out.println("Is the third number the largest? YES");
	}else{
	System.out.println("Is the third number the largest? NO");
	}

	}
}
