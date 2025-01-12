import java.util.*;
public class SumCount{
//que 11
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		
		System.out.println("ENTER THE VALUE FROM USER");
		
		while(true)
		{
			double value =sc.nextDouble();
			if(value==0)
			{
				break;
			}
			total = total+value;

		}
		System.out.println("The sum is " + total);
		
	}
}
		

				
		
		