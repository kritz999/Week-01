import java.util.*;
public class Divisible
{
	public static void main (String[]args)
       {
  
         Scanner sc = new Scanner(System.in);
	// enter the value of number
	System.out.println("ENTER THE VALUE OF NUMBER"); 
	int number = sc.nextInt();
	//checking if the number is divisible by 5 or not
	if(number%5 == 0){
        System.out.println("Is the number "+ number+" divisible by 5 "+ "YES");

         }else{
         System.out.println("Is the number "+ number+" divisible by 5 "+ "NO");

       }
}

}