import java.util.*;
public class Rocket{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		//enter the value of the counter to start count down

		System.out.println("ENTER THE VALUE OF THE COUNTER");
		int counter =sc.nextInt();
		
  		while(counter>=1){
		System.out.println("T-"+ counter+"seconds");
 		counter--;
		}
		System.out.println("Launch");
	}
	
}