import java.util.*;
public class MultiValueArray{
 	public static void main(String[]args){

			Scanner sc = new Scanner(System.in);

			//initializing the size of the array

			double [] numbers = new double[10];

			double total =0.0;

			int index =0;
			System.out.println("Enter the values if 0 or neg or equals to 10 it will break ");

			while(true){

				double userInput = sc.nextDouble();

				if(userInput<=0){

					break;

					}

				if (index ==10){

				System.out.println("The maximum limit is upto 10");

					break;

					}
			 	// storing number in the array and increment it

					numbers[index]= userInput;

					index++;

					}
                                for (int i = 0; i < index; i++) {
                               total += numbers[i];
        }

                            // Display the numbers and their sum
                          System.out.println("\nThe numbers entered are:");
                         for (int i = 0; i < index; i++) {
                           System.out.println(numbers[i]);
        }

                    System.out.println("The total sum of the numbers is: " + total);

        sc.close(); // Close the scanner
    }
}