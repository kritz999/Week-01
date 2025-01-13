import java.util.*;
public class PosNegArray{

  public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		// making an array of size 5
		int [] arr = new int [5];

		System.out.println("ENTER THE VALUES OF NUMBERS UPTO 5");
		
		for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

		}
		

		for(int i=0;i<arr.length;i++){

		if(arr[i]>0){

			if(arr[i]%2==0){

				System.out.println(arr[i]+" Number is even and positive");
					}

			else{

				System.out.println(arr[i]+" Number is odd and positive");
				
				}
			}else if(arr[i]==0){

				System.out.println(arr[i]+" the number is zero");
				}else{

				System.out.println(arr[i]+" the number is negative");

					}

				}

			//comparing 1st and last element of the array to find equal,greater,or less.
				if(arr[0]>arr[arr.length-1]){
				System.out.println("FIrst element is greater");

					}else if(arr[0]==arr[arr.length-1]){
				System.out.println("First and last element is equal");
					}
					else{

				System.out.println("First element is smaller then last element");}
					}
   }



     			
		