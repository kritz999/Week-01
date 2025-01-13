import java.util.*;
public class MultiplicationArray{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);

		//enter the value of number whose multiplication you want to perform 
		
		System.out.println("ENTER THE NUMBER");
		int number =  sc.nextInt();

		//enter the size of array

		int [] Mult = new int [10];

		//multiplication of number

		for(int i=1;i<=10;i++){
			
			Mult[i-1] = number* i; // store the result in the array

			}

		

		// displaying the result of multiplication 

		for(int i=1;i<=10;i++){

			System.out.println(number + " * " +  i  +" = " + Mult[i-1]);

			}

}
}