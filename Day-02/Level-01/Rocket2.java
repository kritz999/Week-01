import java.util.*;
public class Counter2{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		//ENTER THE VALUE OF THE COUNTER
		System.out.println("ENTER THE VALUE OF THE COUNTER"); 
		int counter = sc.nextInt();
		for(int i=counter;i>=1;i--){
		System.out.println("T- "+counter+ " seconds");
		}
		System.out.println("Launch");
		}
     }