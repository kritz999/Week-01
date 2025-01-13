
import java.util.Scanner;

public class MeanHeightArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array to store up to 10 elements of type double

	System.out.println("ENTER THE SIZE OF ARRAY");
	int size = sc.nextInt();
        double[] numbers = new double[size];

       
   	System.out.println("Enter the 11 values ");

	for(int i =0;i<numbers.length;i++){
		
		numbers[i] = sc.nextDouble();

		
		}
	
	double sum = 0.0;

	for(int i =0; i<numbers.length ;i++){

		sum+= numbers[i];


		}

	Double meanHeight = sum/size;

	System.out.println("The meanHeight = " + meanHeight);





    }
}

