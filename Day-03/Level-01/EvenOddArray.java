import java.util.*;

public class EvenOddArray{

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		

		if(number<=0){

			System.out.println("Error! Please enter a natural number.");
                       return;

			}

			int size = number/2+1;
		
			int [] even = new int[size];
			
			int [] odd = new int[size];

			int evenIndex =0, oddIndex =0;
			 
			
			for(int i=1;i<=number;i++){

				if(i%2==0){
					even[evenIndex]=i;
					evenIndex++;
					}
					else{

					odd[oddIndex]=i;
					oddIndex++;
					}

				}

			System.out.println("Odd Numbers:");
        		for (int i = 0; i < oddIndex; i++) {
           		 System.out.print(odd[i] + " ");
        			}

        		// Printing the even numbers array
       			 System.out.println("\nEven Numbers:");
       			 for (int i = 0; i < evenIndex; i++) {
           	   	 System.out.print(even[i] + " ");
}
		   
}
}
		