import java.util.*;
public class ArmstrongNumber{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		
		int number = input.nextInt();
		//123
		
		int sum =0;
		int originalNumber = number;

		while(number!=0){
		
		//the last digit will be obtained and stored in digit
		int digit = number%10;

		//finding the cube of the digit
		sum+=Math.pow(digit,3);

		number/=10;

		}

		//checking sum is equals to digit

		if (sum==originalNumber){
			System.out.println("The number is amstrong number");
			}else{
			System.out.println("The number is not amstrong number");

			}
}
}