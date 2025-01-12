import java.util.*;
public class SimpleInterests
{
public static void main(String[] args)
	{
 	Scanner input=new Scanner(System.in);
 	 double principle,rate,Time;
  	System.out.println("Enter principle amount, rate of interest and time:");
 	 principle= input.nextDouble();
 	 rate= input.nextDouble();
  	Time= input.nextDouble();
  
  	//finding simple interest
  	double simpleInterest= (principle*rate*time)/100;
  
  	//display
  	System.out.println("the Simple Interest is "+simpleInterest+" for Principle "+principle+","+"rate of interest "+ rate+" and Time " + Time);
}
}