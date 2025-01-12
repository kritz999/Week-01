import java.util.*;
public class NumberOfRounds
{
public static void main(String[] args)
{
  	Scanner sc =new Scanner(System.in);
   	double Side1,Side2,Side3;
  	System.out.print("Enter the length of sides in metres:");
  	 //taking sides in input
   	Side1= sc.nextDouble();
  	 Side2= sc.nextDouble();
   	Side3= sc.nextDouble();

  	//finding perimeter
  	 double perimeter= Side1+Side2+Side3;

  	// number of rounds
  	 double rounds= 5000/perimeter;
 
  	//display
   	System.out.println("the total number of rounds the athlete will run is "+rounds+" to complete 5 km");
}
}