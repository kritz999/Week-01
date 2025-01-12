import java.util.*;
public class CheckNum{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	
	//enter the value of the number
	System.out.println("ENTER THE VALUE OF THE NUMBER");
	int number = sc.nextInt();
	if (number>0){
	System.out.println("Positive");
	}
	if(number<0){
	System.out.println("Negative");
	}
	if(number==0){
	System.out.println("Zero");
	}
}
}
